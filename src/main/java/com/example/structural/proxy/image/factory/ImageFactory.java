package com.example.structural.proxy.image.factory;

import com.example.structural.proxy.image.Image;
import com.example.structural.proxy.image.proxy.ImageProxy;

public class ImageFactory {
    
    public static Image getImage(String name) {
        return new ImageProxy(name);
    }

}
