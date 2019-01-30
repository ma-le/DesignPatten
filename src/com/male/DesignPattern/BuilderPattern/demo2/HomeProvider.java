package com.male.DesignPattern.BuilderPattern.demo2;

public class HomeProvider {

    static Myhome commandBuilder(String levelname){

        HomeBuilder homeBuilder = new HomeBuilder();
        return homeBuilder.buildbathroom(levelname+"厨房").buildgate(levelname+"大门")
                .buildkitchen(levelname+"厨房").buildtoilet(levelname+"浴室").build();

    }
}
