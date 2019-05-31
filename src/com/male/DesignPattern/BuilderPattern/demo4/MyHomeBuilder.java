package com.male.DesignPattern.BuilderPattern.demo4;

public class MyHomeBuilder extends AbstractBuilder {

    MyHome myHome = new MyHome();

    @Override
    MyHome getMyHome() {
        return myHome;
    }

    @Override
    MyHomeBuilder setDoor(String door) {
        myHome.setMyDoor(door);
        return this;
    }

    @Override
    MyHomeBuilder setGate(String gate) {
        myHome.setMyGate(gate);
        return this;
    }

    @Override
    MyHomeBuilder setCourtyard(String courtyard) {
        myHome.setMyCourtyard(courtyard);
        return this;
    }

    @Override
    MyHomeBuilder setBackyard(String backyard) {
        myHome.setMyBackyard(backyard);
        return this;
    }
}
