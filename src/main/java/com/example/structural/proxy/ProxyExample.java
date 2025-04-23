package com.example.structural.proxy;

import com.example.structural.proxy.image.Image;
import com.example.structural.proxy.image.factory.ImageFactory;

import javafx.geometry.Point2D;

public class ProxyExample {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage("A1.bmp");
        image.setLocation(new Point2D(10, 10));
        System.out.println("Image location: " + image.getLocation());
        System.out.println("Rendering image now....");
        image.render();
    }
}
