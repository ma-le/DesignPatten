package com.male.DesignPattern.BuilderPattern.demo2;

public class HomeBuilder extends AbsBuilder{
    private Myhome myhome = new Myhome();
    @Override
    Myhome build() {
        return myhome;
    }

    @Override
    HomeBuilder buildgate(String gate) {
        myhome.setGate(gate);
        return this;
    }

    @Override
    HomeBuilder buildkitchen(String kitchen) {
        myhome.setKitchen(kitchen);
        return this;
    }

    @Override
    HomeBuilder buildtoilet(String toilet) {
        myhome.setToilet(toilet);
        return this;
    }

    @Override
    HomeBuilder buildbathroom(String bathroom) {
        myhome.setBathroom(bathroom);
        return this;
    }
}
