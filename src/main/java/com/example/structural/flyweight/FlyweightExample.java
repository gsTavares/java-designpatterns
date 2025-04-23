package com.example.structural.flyweight;

import com.example.structural.flyweight.message.ErrorMessageFactory;
import com.example.structural.flyweight.message.SystemErrorMessage;
import com.example.structural.flyweight.message.UserBannedErrorMessage;
import com.example.structural.flyweight.message.ErrorMessageFactory.ErrorType;

public class FlyweightExample {
    public static void main(String[] args) {
        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
        System.out.println(msg2.getText(null));
    }

}
