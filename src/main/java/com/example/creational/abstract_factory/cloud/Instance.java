package com.example.creational.abstract_factory.cloud;

import com.example.creational.abstract_factory.storage.Storage;

// Abstract product
public interface Instance {

    enum Capacity {
        MICRO, SMALL, LARGE
    }

    void start();

    void attachStorage(Storage storage);

    void stop();
}
