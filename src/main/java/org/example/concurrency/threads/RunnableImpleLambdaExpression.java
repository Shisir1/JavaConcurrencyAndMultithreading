package org.example.concurrency.threads;

public class RunnableImpleLambdaExpression {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Running");
        };

        Thread thread1 = new Thread(runnable, "The Thread1 ");
        thread1.start();

        Thread thread2 = new Thread(runnable, "The Thread2 ");
        thread2.start();
    }
}
