package com.male.DesignPattern.BuilderPattern.demo3;

public class Leye {

    private Builder builder;

    public Leye(Builder builder){
        this.builder = builder;
    }

    public Meal cook(){
        builder.buildDrink();
        builder.buildFood();

        return builder.getResult();
    }
}
