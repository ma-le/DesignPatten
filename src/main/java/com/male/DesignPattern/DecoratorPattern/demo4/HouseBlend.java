package com.male.DesignPattern.DecoratorPattern.demo4;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.333;
    }
}
