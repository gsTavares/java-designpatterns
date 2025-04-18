package com.example.structural.decorator.message.decorator;

import org.apache.commons.text.StringEscapeUtils;

import com.example.structural.decorator.message.Message;

public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }

}
