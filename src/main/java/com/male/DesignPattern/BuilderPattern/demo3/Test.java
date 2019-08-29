package com.male.DesignPattern.BuilderPattern.demo3;

public class Test {

    public static void main(String[] args) {
        Builder builder = new LunchBuilder();

        Leye leye = new Leye(builder);

        Meal cook = leye.cook();

        System.out.println("午饭 主食："+cook.getFood()+"...饮料："+cook.getDrink());
    }
}
