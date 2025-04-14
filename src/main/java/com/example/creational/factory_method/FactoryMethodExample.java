package com.example.creational.factory_method;

import com.example.creational.factory_method.creator.JsonMessageCreator;
import com.example.creational.factory_method.creator.MessageCreator;
import com.example.creational.factory_method.creator.TextMessageCreator;
import com.example.creational.factory_method.message.Message;

public class FactoryMethodExample {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message);
    }
}
