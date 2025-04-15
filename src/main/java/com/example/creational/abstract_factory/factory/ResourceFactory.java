package com.example.creational.abstract_factory.factory;

import com.example.creational.abstract_factory.cloud.Instance;
import com.example.creational.abstract_factory.storage.Storage;

// Abstract factory
public interface ResourceFactory {
    
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capacityInMib);

}
