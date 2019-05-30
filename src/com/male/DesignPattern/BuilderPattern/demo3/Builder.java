package com.male.DesignPattern.BuilderPattern.demo3;

public abstract class Builder {
    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getResult(){
        return meal;
    }
}
