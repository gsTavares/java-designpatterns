package com.example.structural.proxy.image;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String name) {
        System.out.println("Loaded from disk: " + name);
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2d) {
        this.location = point2d;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered " + this.name);
    }
    
}
