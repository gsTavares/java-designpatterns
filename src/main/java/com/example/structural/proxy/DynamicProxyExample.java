package com.example.structural.proxy;

import com.example.structural.proxy.dynamic.ImageFactory;
import com.example.structural.proxy.image.Image;

import javafx.geometry.Point2D;

public class DynamicProxyExample {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage("A2.bmp");
        image.setLocation(new Point2D(-10, 0));
        System.out.println(image.getLocation());
        System.out.println("*********************");
        image.render();
    }
}
