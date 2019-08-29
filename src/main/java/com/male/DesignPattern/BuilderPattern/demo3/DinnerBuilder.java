package com.male.DesignPattern.BuilderPattern.demo3;

public class DinnerBuilder extends Builder{
    @Override
    public void buildFood() {
        meal.setFood("MM");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("XG");
    }
}
