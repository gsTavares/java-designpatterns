package com.example.structural.decorator;

import com.example.structural.decorator.message.Message;
import com.example.structural.decorator.message.decorator.Base64EncodedMessage;
import com.example.structural.decorator.message.decorator.HtmlEncodedMessage;
import com.example.structural.decorator.message.impl.TextMessage;

public class DecoratorExample {
    public static void main(String[] args) {
        Message message = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(message.getContent());

        Message decorator = new HtmlEncodedMessage(message);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(decorator); // recursive composition!!!

        System.out.println(decorator.getContent());
    }
}
