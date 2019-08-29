package com.male.DesignPattern.BuilderPattern.demo2;

public abstract class AbsBuilder<T> {
//https://blog.csdn.net/Arthurs_L/article/details/81287128
    abstract T build();

    abstract T buildgate(String gate);
    abstract T buildkitchen(String kitchen);
    abstract T buildtoilet(String toilet);
    abstract T buildbathroom(String bathroom);
}
