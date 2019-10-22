package com.male.DesignPattern.DecoratorPattern.demo4;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+" +soy";
    }

    @Override
    public double cost() {
        return 0.44 + this.beverage.cost();
    }
}
