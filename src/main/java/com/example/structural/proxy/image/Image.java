package com.example.structural.proxy.image;

import javafx.geometry.Point2D;

public interface Image {

    void setLocation(Point2D point2d);

    Point2D getLocation();

    void render();

}
