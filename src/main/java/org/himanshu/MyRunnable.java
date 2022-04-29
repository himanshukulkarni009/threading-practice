package org.himanshu;

public class MyRunnable implements Runnable {

    private final long countUntil;
    private final int taskNumber;

    public MyRunnable(long countUntil, int taskNumber) {
        this.countUntil = countUntil;

        this.taskNumber = taskNumber;
    }

    public void run() {

        long sum = 0;

        for (int i = 0; i < countUntil; i++) {
            sum++;
        }
        System.out.printf("Sum %d, Task number %d \n", sum, taskNumber);
    }
}
