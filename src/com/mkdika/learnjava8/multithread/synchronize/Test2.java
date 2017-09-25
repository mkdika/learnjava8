package com.mkdika.learnjava8.multithread.synchronize;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * WITH SYNCHRONIZED
 */
public class Test2 {

    public static void main(String args[]) {
        PrintDemo1 printDemo = new PrintDemo1();
        ThreadDemo1 firstThread = new ThreadDemo1("Thread 1", printDemo);
        ThreadDemo1 secondThread = new ThreadDemo1("Thread 2", printDemo);
        try {
            firstThread.start();
            secondThread.start();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}

class PrintDemo1 {

    public void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Selected number is: " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread has been interrupted.");
        }
    }
}

class ThreadDemo1 implements Runnable {

    private Thread thread;
    private String threadName;
    PrintDemo1 printDemo;

    ThreadDemo1(String threadName, PrintDemo1 printDemo) {
        this.threadName = threadName;
        this.printDemo = printDemo;
    }

    @Override
    public void run() {
        synchronized (printDemo) {
            printDemo.printCount();
        }
        System.out.println(threadName + " is finishing.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
