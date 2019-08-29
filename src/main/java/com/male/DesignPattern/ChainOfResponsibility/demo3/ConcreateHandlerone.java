package com.male.DesignPattern.ChainOfResponsibility.demo3;

public class ConcreateHandlerone extends Handler{
    @Override
    public void handlerRequest(String request) {
        if("one".equals(request)){
            System.out.println("one处理了");
        }else{
            if(null != getHandler()){
                getHandler().handlerRequest(request);
            }else{
                System.out.println("没人处理1");
            }
        }
    }
}
