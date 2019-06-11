package com.male.Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService service = Executors.newFixedThreadPool(1);

        FutureTask task = new FutureTask(new Call(0));

        service.submit(task);


        System.out.println(task.get(5, TimeUnit.SECONDS));

    }

    public static class Call implements Callable<Integer>{

        private Integer num;

        public Call(Integer num){
            this.num = num;
        }
        @Override
        public Integer call() throws Exception {

            for(int i = 0; i<10; i++){
                num += 1;
            }
            Thread.sleep(2000);
            return num;
        }
    }
}
