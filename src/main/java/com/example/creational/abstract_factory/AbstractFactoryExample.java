package com.example.creational.abstract_factory;

import com.example.creational.abstract_factory.cloud.Instance;
import com.example.creational.abstract_factory.factory.AwsResourceFactory;
import com.example.creational.abstract_factory.factory.GoogleResourceFactory;
import com.example.creational.abstract_factory.factory.ResourceFactory;
import com.example.creational.abstract_factory.storage.Storage;

public class AbstractFactoryExample {

    private ResourceFactory resourceFactory;

    public AbstractFactoryExample(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createInstance(Instance.Capacity capacity, int storageMib) {
        Instance instance = this.resourceFactory.createInstance(capacity);
        Storage storage = this.resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
        AbstractFactoryExample aws = new AbstractFactoryExample(new AwsResourceFactory());
        Instance i1 = aws.createInstance(Instance.Capacity.MICRO, 20480);
        i1.start();
        i1.stop();

        System.out.println("*****************");

        AbstractFactoryExample gcp = new AbstractFactoryExample(new GoogleResourceFactory());

        i1 = gcp.createInstance(Instance.Capacity.MICRO, 20480);
        i1.start();
        i1.stop();
    }
}
