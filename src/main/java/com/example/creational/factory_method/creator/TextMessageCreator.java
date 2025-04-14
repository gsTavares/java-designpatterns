package com.example.creational.factory_method.creator;

import com.example.creational.factory_method.message.Message;
import com.example.creational.factory_method.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
    
}
