package com.example.creational.prototype;

import com.example.creational.prototype.gameunit.General;
import com.example.creational.prototype.gameunit.Swordsman;

import javafx.geometry.Point3D;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();

        System.out.println(s1);
        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println("Cloned Swordsman " + s2);

        General general = new General();
        general.move(new Point3D(-30, 0, 0), 60);
        general.boostMorale();

        System.out.println(general);

        General general2 = (General) general.clone(); // will throw CloneNotSupportedException
        System.out.println("Cloned General " + general2);
    }
}
