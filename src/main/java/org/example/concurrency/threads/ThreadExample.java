package org.example.concurrency.threads;

public class ThreadExample {
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("thread running");
            System.out.println("thread stopped");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
