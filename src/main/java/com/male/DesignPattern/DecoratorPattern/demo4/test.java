package com.male.DesignPattern.DecoratorPattern.demo4;

import java.util.Date;

public class test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("纯的描述   "+beverage.getDescription());
        System.out.println("纯的价格   "+beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println("加摩卡的描述   "+beverage.getDescription());
        System.out.println("加摩卡的价格   "+beverage.cost());

        beverage = new Soy(beverage);
        System.out.println("加大豆的描述   "+beverage.getDescription());
        System.out.println("加大豆的价格   "+beverage.cost());
        System.out.println(new Date().getTime());
    }
}
