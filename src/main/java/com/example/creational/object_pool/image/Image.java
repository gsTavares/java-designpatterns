package com.example.creational.object_pool.image;

import com.example.creational.object_pool.poolable.Poolable;

import javafx.geometry.Point2D;

public interface Image extends Poolable {
    
    void draw();
    Point2D getLocation();
    void setLocation(Point2D location);

}
