package com.se.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask> tasks = List.of(new CallableTask("Durga"), new CallableTask("In28Minutes"), new CallableTask("Learning "));
        String result = executorService.invokeAny(tasks);

        System.out.println(result);
        executorService.shutdown();
    }
}
