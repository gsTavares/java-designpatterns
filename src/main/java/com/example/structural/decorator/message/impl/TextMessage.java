package com.example.structural.decorator.message.impl;

import com.example.structural.decorator.message.Message;

public class TextMessage implements Message {

    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg;
    }
    
}
