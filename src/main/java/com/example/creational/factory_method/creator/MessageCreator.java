package com.example.creational.factory_method.creator;

import com.example.creational.factory_method.message.Message;

public abstract class MessageCreator {
    
    public Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();
        
        return message;
    }

    // Factory method
    public abstract Message createMessage();

}
