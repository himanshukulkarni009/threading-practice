package org.himanshu;

import java.util.ArrayList;
import java.util.List;

public class TesterManualThread {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 500 ; i++ ) {
            MyRunnable task = new MyRunnable(1000000L, i);
            Thread worker = new Thread(task);
            worker.start();

            threads.add(worker);
        }

        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have " + running + " running threads. ");
        } while (running > 0);

    }
}
