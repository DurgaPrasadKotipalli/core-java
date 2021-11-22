package com.se.multithreading;

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Task1 started");
        for(int i=0; i<10; i++){
            System.out.print(i+" ");
        }
        System.out.println("Task1 Done");
    }
}

class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Task2 started");
        for(int i=10; i<20; i++){
            System.out.print(i+" ");
        }
        System.out.println("Task2 Done");
    }
}
public class MyThread {


}
