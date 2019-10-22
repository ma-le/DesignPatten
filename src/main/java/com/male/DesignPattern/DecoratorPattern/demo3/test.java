package com.male.DesignPattern.DecoratorPattern.demo3;

public class test {

    public static void main(String[] args) {
        Girl girl = new EuropeanGirl();
        System.out.println(girl.getDescription());

        Science girl2 = new Science(girl);
        System.out.println(girl2.getDescription());

        Art girl3 = new Art(girl2);
        System.out.println(girl3.getDescription());
    }
}
