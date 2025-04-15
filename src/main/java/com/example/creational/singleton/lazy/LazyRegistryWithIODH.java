package com.example.creational.singleton.lazy;

public class LazyRegistryWithIODH {
    
    private LazyRegistryWithIODH() {
        System.out.println("In LazyRegistryWithIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryWithIODH INSTANCE = new LazyRegistryWithIODH();
    }

    public static LazyRegistryWithIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }

}
