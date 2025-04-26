package com.example.behavioral.command;

import com.example.behavioral.command.runner.MailTaskRunner;
import com.example.behavioral.command.service.EWSService;

public class CommandExample {
    public static void main(String[] args) throws InterruptedException {
        EWSService service = new EWSService();
        Command c1 = new AddMemberCommand("a@a.com", "spam", service);

        MailTaskRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("b@b", "spam", service);
        MailTaskRunner.getInstance().addCommand(c2);

        Thread.sleep(3000);
        MailTaskRunner.getInstance().shutdown();
    }
}
