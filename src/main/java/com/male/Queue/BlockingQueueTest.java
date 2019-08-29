package com.male.Queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {

    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue(5, true);

    private static CountDownLatch produceLatch;
    private static CountDownLatch consumerLatch;

    public static void main(String[] args) throws InterruptedException {
        BlockingQueueTest queueTest = new BlockingQueueTest();
        queueTest.test();
    }

    private void test() throws InterruptedException {
        produceLatch = new CountDownLatch(10);
        consumerLatch = new CountDownLatch(10);

        Thread proT = new Thread(new ProducerTask());
        Thread conT = new Thread(new ConsumerTask());

        proT.start();
        conT.start();

        try {
            System.out.println("producer waiting...");
            produceLatch.await(); //进入等待状态，直到state值为0，再继续往下执行
            System.out.println("producer end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("consumer waiting...");
            consumerLatch.await(); //进入等待状态，直到state值为0，再继续往下执行
            System.out.println("consumer end");
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }

        //结束线程
        proT.interrupt();
        conT.interrupt();

        System.out.println("end");
    }

    class ProducerTask implements Runnable{

        private Random random = new Random();

        @Override
        public void run() {

            while (true){

                try {
                    int i = random.nextInt(100);
                    System.out.println("producer放入的值："+i);
                    queue.put(i);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                }finally {
                    produceLatch.countDown();
                }
            }
        }
    }


    class ConsumerTask implements Runnable{

        @Override
        public void run() {
            while (true){
                try {
                    Integer take = queue.take();

                    System.out.println("consumer取到的值："+take);

                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                }finally {
                    consumerLatch.countDown();
                }
            }
        }
    }
}
