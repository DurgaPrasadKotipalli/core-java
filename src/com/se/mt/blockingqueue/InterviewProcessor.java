package com.se.mt.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable{

    private BlockingQueue<String> queue;

    InterviewProcessor(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            String msg;
            Thread.sleep(10000 );
            while(!(msg = queue.take()).equals( "stop" )){
                System.out.println("Interview completed for "+msg);
                Thread.sleep( 10000 );
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
