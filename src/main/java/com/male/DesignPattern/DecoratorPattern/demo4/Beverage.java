package com.male.DesignPattern.DecoratorPattern.demo4;

public abstract class Beverage {
    private String description = "unknow beverage";

    public String getDescription(){
        return description;
    }

//test
    public abstract double cost();
}
