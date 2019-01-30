package com.male.DesignPattern.BuilderPattern.demo1;

public class MealA extends MealBuilder{
    @Override
    public void buildfood() {
        meal.setFood("饺子");
    }

    @Override
    public void builddrink() {
        meal.setDrink("伊力特");
    }
}
