package com.male.DesignPattern.DecoratorPattern.demo4;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+"+ mocha";
    }

    @Override
    public double cost() {
        return 0.33+this.beverage.cost();
    }
}
