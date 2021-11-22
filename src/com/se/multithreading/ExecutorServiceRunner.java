package com.se.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
   In this example, we are creating an ExecutorService which can execute one thread one at a time.
 */
public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Task2());

        System.out.println("Task3 is started");
        for(int i=20; i<30; i++){
            System.out.print(i+ " ");
        }
        System.out.println("Task3 is completed");
        executorService.shutdown();
    }
}
