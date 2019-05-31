package com.male.DesignPattern.BuilderPattern.demo4;

public class test {
    public static void main(String[] args) {

        MyHomeBuilder myHomeBuilder = new MyHomeBuilder();
        MyHome myHome = myHomeBuilder.setBackyard("小后院").setCourtyard("小院子").setDoor("小木门").setGate("大铁门").getMyHome();
        System.out.println(myHome.toString());


    }




}
