package com.male.Thread.Callable;

import java.util.concurrent.*;

public class Calltest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final Integer v = 5;
        ExecutorService service = Executors.newFixedThreadPool(v);
        CountDownLatch c = new CountDownLatch(1);
        System.out.println("主线程开始");
        Integer p = null;
        for (int i = 0; i < v; i++){
            c.await();
            Translate a = new Translate(i + 1, c);
            Future<Integer> submit  = service.submit(a);
            p = submit.get();
//            break;
        }
        for (;;){
            if(null != p){
                break;
            }
        }
        System.out.println("返回值 ："+p);
        service.shutdown();
    }
}
