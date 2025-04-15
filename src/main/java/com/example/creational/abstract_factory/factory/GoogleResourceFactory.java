package com.example.creational.abstract_factory.factory;

import com.example.creational.abstract_factory.cloud.GoogleComputeEngineInstance;
import com.example.creational.abstract_factory.cloud.Instance;
import com.example.creational.abstract_factory.cloud.Instance.Capacity;
import com.example.creational.abstract_factory.storage.GoogleCloudStorage;
import com.example.creational.abstract_factory.storage.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
    
}
