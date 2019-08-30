package com.male.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatch1 {

    public static final int RUNNER_COUNT = 3;

    public static void main(String[] args) throws InterruptedException{
        final CountDownLatch begin = new CountDownLatch(1);
//        final CountDownLatch end = new CountDownLatch(10);

        final ExecutorService service = Executors.newFixedThreadPool(RUNNER_COUNT);

        for (int i = 0; i < RUNNER_COUNT; i++){
            int no = i + 1;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep((long)(Math.random()*1000*RUNNER_COUNT));
                        System.out.println("第"+no+"个已经翻译。。。。。");
                        begin.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            service.submit(runnable);
        }

        System.out.println("翻译开始。。。。");
        begin.await();
        System.out.println("翻译结束。。。。");
        service.shutdown();
    }
}
