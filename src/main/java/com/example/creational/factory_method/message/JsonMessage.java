package com.example.creational.factory_method.message;

public class JsonMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON\": []}";
    }
    
}
