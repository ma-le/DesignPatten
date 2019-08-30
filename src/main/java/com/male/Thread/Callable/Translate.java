package com.male.Thread.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class Translate implements Callable<Integer> {
    private Integer a;
    private CountDownLatch b;

    public Translate(Integer a, CountDownLatch b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public Integer call() throws Exception {
        b.await();
        System.out.println("子线程开始"+a);

        Thread.sleep((long)(Math.random()*10000));


        System.out.println("子线程："+a);
        return a;
    }
}
