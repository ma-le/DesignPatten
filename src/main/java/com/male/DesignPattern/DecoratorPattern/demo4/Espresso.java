package com.male.DesignPattern.DecoratorPattern.demo4;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 0.22;
    }
}
