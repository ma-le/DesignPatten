package com.male.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest1 {
    public static final int RUNNER_COUNT = 10;

    public static void main(String[] args) throws InterruptedException{
        final CountDownLatch begin = new CountDownLatch(1);
        final CountDownLatch end = new CountDownLatch(10);

        final ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < RUNNER_COUNT; i++){
            int no = i + 1;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        begin.await();
                        Thread.sleep((long)(Math.random()*1000));
                        System.out.println("第"+no+"个已经抵达。。。。。");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        end.countDown();
                    }
                }
            };
            Thread a = new Thread();
            a.join();
            service.submit(runnable);
        }

        System.out.println("比赛开始。。。。");
        begin.countDown();
        end.await();
        System.out.println("比赛结束。。。。");
        service.shutdown();
    }
}
