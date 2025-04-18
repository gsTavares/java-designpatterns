package com.example.creational.prototype.gameunit;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable {
    
    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        this.position = new Point3D(x, y, z);
    }

    public void move(Point3D diretion, float distance) {
        Point3D finalMove = diretion.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        this.reset();
    }

    protected abstract void reset();

}
