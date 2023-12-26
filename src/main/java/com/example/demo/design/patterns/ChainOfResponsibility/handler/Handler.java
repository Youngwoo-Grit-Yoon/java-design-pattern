package com.example.demo.design.patterns.ChainOfResponsibility.handler;

public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (this.next == null) {
            return true;
        } else {
            return this.next.handle(username, password);
        }
    }
}
