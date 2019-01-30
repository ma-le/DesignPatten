package com.male.DesignPattern.BuilderPattern.demo2;

public class Test {

    public static void main(String[] args) {
        Myhome home = HomeProvider.commandBuilder("中档");
        System.out.println(home.toString());
    }
}
