package com.example.creational.singleton;

import com.example.creational.singleton.eager.EagerRegistry;
import com.example.creational.singleton.lazy.LazyRegistryWithDCL;
import com.example.creational.singleton.lazy.LazyRegistryWithIODH;

public class SingletonExample {
    public static void main(String[] args) {
        EagerRegistry eagerRegistry = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry2 = EagerRegistry.getInstance(); // same instance

        System.out.println(eagerRegistry == eagerRegistry2);

        LazyRegistryWithDCL lazyRegistry1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistry2 = LazyRegistryWithDCL.getInstance();
        
        System.out.println(lazyRegistry1 == lazyRegistry2);

        LazyRegistryWithIODH lazyRegistryWithIODH;
        lazyRegistryWithIODH = LazyRegistryWithIODH.getInstance();
        lazyRegistryWithIODH = LazyRegistryWithIODH.getInstance();
        lazyRegistryWithIODH = LazyRegistryWithIODH.getInstance();
        lazyRegistryWithIODH = LazyRegistryWithIODH.getInstance();
    }
}
