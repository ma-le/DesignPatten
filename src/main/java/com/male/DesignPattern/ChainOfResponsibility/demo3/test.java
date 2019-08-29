package com.male.DesignPattern.ChainOfResponsibility.demo3;

public class test {
    public static void main(String[] args) {
        Handler h1 = new ConcreateHandlerone();
        Handler h2 = new ConcreateHandlertwo();

        h1.setHandler(h2);

        h1.handlerRequest("tw2o");
    }
}
