package com.example.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.example.structural.proxy.image.BitmapImage;
import com.example.structural.proxy.image.Image;

import javafx.geometry.Point2D;

public class ImageInvocationHandler implements InvocationHandler {

    private String name;
    private Point2D location;
    private BitmapImage image;
    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    static {
        try {
            setLocationMethod = Image.class.getMethod("setLocation", new Class[] { Point2D.class });
            getLocationMethod = Image.class.getMethod("getLocation", null);
            renderMethod = Image.class.getMethod("render", null);
        } catch (Exception e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public ImageInvocationHandler(String name) {
        this.name = name;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method: " + method.getName());

        if(method.equals(setLocationMethod)) {
            return handleSetLocation(args);
        } else if(method.equals(getLocationMethod)) {
            return handleGetLocation();
        } else if(method.equals(renderMethod)) {
            return handleRender();
        }
        return null;
    }

    private Object handleSetLocation(Object[] args) {
        if(image != null) {
            image.setLocation((Point2D) args[0]);
        } else {
            this.location = (Point2D) args[0];
        }
        return null;
    }

    private Point2D handleGetLocation() {
        if(image != null) {
            return image.getLocation();
        } else {
            return this.location;
        }
    }

    private Object handleRender() {
        if(image == null) {
            image = new BitmapImage(name);
            if(location != null) {
                image.setLocation(location);
            }
        }
        image.render();
        return null;
    }

}
