package com.example.creational.factory_method.creator;

import com.example.creational.factory_method.message.JsonMessage;
import com.example.creational.factory_method.message.Message;

public class JsonMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
    
}
