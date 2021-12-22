package com.se.mt.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {

    private BlockingQueue<String> queue;

    InterviewScheduler(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("10 candidates have arrived");
        for(int i=0; i<10; i++){
            String msg = new String("candidate "+i);
            try{
                queue.put( msg);
                System.out.println("Interview scheduled for "+msg);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Interview scheduled for all candidates");
        String msg = new String("stop");
        try{
            queue.put( msg );
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
