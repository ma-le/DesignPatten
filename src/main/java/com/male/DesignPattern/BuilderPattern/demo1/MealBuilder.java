package com.male.DesignPattern.BuilderPattern.demo1;

public abstract class MealBuilder {

    Meal meal = new Meal();

    public abstract void buildfood();

    public abstract void builddrink();

    public Meal getMeal(){
        return meal;
    }
}
