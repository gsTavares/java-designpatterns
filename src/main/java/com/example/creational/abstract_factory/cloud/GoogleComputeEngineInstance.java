package com.example.creational.abstract_factory.cloud;

import com.example.creational.abstract_factory.storage.Storage;

// Concrete Product in "Google Cloud" family
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Compute Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine Instance stopped");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance";
    }
    
}
