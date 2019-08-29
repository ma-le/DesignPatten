package com.male.Sort;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.locks.ReentrantLock;

public class test {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(MainConfig.class);
        BubbleSort bean = a.getBean(BubbleSort.class);
        a.close();

    }
}


