package org.himanshu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TesterWithThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for( int i = 0 ; i < 500 ; i++) {
            MyRunnable task = new MyRunnable(100000000L, i);
            executor.submit(task);
            System.out.println("Task " + i);
        }

        System.out.println("Finished task feeding");

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Finished");
    }
}
