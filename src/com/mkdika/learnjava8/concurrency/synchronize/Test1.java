package com.mkdika.learnjava8.concurrency.synchronize;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * WITHOUT SYNCHRONIZED
 */
public class Test1 {

    public static void main(String args[]) {
        PrintDemo printDemo = new PrintDemo();
        ThreadDemo firstThread = new ThreadDemo("Thread 1", printDemo);
        ThreadDemo secondThread = new ThreadDemo("Thread 2", printDemo);
        try {
            firstThread.start();
            secondThread.start();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}

class PrintDemo {

    private int i;

    public void printCount() {
        try {
            for (i = 5; i > 0; i--) {
                System.out.println("Selected number is: " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread has been interrupted.");
        }
    }
}

class ThreadDemo implements Runnable {

    private Thread thread;
    private String threadName;
    PrintDemo printDemo;

    ThreadDemo(String threadName, PrintDemo printDemo) {
        this.threadName = threadName;
        this.printDemo = printDemo;
    }

    @Override
    public void run() {
        printDemo.printCount();
        System.out.println("Thread " + threadName + " finishing.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
