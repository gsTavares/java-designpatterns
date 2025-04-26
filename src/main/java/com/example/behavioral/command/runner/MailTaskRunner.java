package com.example.behavioral.command.runner;

import java.util.LinkedList;
import java.util.List;

import com.example.behavioral.command.Command;

public class MailTaskRunner implements Runnable {

    private Thread runner;
    private List<Command> pendingCommands;
    private volatile boolean stop;
    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static final MailTaskRunner getInstance() {
        return RUNNER;
    }

    private MailTaskRunner() {
        this.pendingCommands = new LinkedList<>();
        this.runner = new Thread(this);
        runner.start();
    }

    @Override
    public void run() {
        while(true) {
            Command cmd = null;
            synchronized (pendingCommands) {
                if(pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (Exception e) {
                        System.out.println("Runner interrupted");
                        if(stop) {
                            System.out.println("Runner stopped");
                            return;
                        }
                    }
                } else {
                    cmd = pendingCommands.remove(0);
                }
            }
            if(cmd == null) return;
            cmd.execute();
        }
    }

    public void addCommand(Command cmd)  {
        synchronized (pendingCommands) {
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }
    
}
