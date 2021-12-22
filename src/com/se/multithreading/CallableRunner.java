package com.se.multithreading;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{

    private String name;

    CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+name;
    }
}
public class CallableRunner{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("In28Minutes"));
        String welcomeMessage = welcomeFuture.get();
        System.out.println("CallableTask is executed ");
        System.out.println(welcomeMessage);
        System.out.println("Main() method is completed");
        executorService.shutdown();

    }
}
