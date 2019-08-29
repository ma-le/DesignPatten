package com.male.DesignPattern.BuilderPattern.demo4;


public abstract class AbstractBuilder {

    abstract MyHome getMyHome();
    abstract MyHomeBuilder setDoor(String door);
    abstract MyHomeBuilder setGate(String gate);
    abstract MyHomeBuilder setCourtyard(String courtyard);
    abstract MyHomeBuilder setBackyard(String backyard);
}
