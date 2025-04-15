package com.example.creational.abstract_factory.factory;

import com.example.creational.abstract_factory.cloud.Ec2Instance;
import com.example.creational.abstract_factory.cloud.Instance;
import com.example.creational.abstract_factory.cloud.Instance.Capacity;
import com.example.creational.abstract_factory.storage.S3Storage;
import com.example.creational.abstract_factory.storage.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
    
}
