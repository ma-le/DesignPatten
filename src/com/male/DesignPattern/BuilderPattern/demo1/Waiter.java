package com.male.DesignPattern.BuilderPattern.demo1;

public class Waiter {

    private MealBuilder mealBuilder;

    public Waiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){
        mealBuilder.buildfood();
        mealBuilder.builddrink();
        return mealBuilder.getMeal();
    }
}
