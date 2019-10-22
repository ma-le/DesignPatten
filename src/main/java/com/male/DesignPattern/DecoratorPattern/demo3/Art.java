package com.male.DesignPattern.DecoratorPattern.demo3;

public class Art extends GirlDecorator{

    private Girl girl;

    public Art(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return this.girl.getDescription()+"+ like art";
    }


    public void dance(){
        System.out.println("dance dance");
    }
}
