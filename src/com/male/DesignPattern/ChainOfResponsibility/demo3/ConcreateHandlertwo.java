package com.male.DesignPattern.ChainOfResponsibility.demo3;

public class ConcreateHandlertwo extends Handler {
    @Override
    public void handlerRequest(String request) {
        if("two".equals(request)){
            System.out.println("two处理了");
        }else{
            if(null != getHandler()){
                getHandler().handlerRequest(request);
            }else{
                System.out.println("没人处理2");
            }
        }
    }
}
