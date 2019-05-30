package com.male.DesignPattern.BuilderPattern.demo3;

public class LunchBuilder extends Builder{
    @Override
    public void buildFood() {
        meal.setFood("HMJ");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("BBY");
    }
}
