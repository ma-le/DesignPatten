package com.male.DesignPattern.DecoratorPattern.demo3;

public class Science extends GirlDecorator {

    private Girl girl;

    public Science(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return this.girl.getDescription() + "+ like science";
    }

    public void caltulate(){
        System.out.println(" caltulate");
    }
}
