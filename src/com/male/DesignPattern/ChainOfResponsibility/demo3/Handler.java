package com.male.DesignPattern.ChainOfResponsibility.demo3;

public abstract class Handler {

    public Handler handler;

    public void setHandler(Handler handler){
        this.handler = handler;
    }

    public Handler getHandler(){
        return this.handler;
    }

    public abstract void handlerRequest(String request);
}
