package com.mkdika.learnjava8.concurrency.runnable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestRunnable2 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);
        Thread tA = new Thread(new CounterPrinter(counter, 500), "A");
        Thread tB = new Thread(new CounterPrinter(counter, 500), "B");
        Thread tC = new Thread(new CounterPrinter(counter, 500), "C");
        Thread tD = new Thread(new CounterPrinter(counter, 500), "D");
        tA.start();
        tB.start();
        tC.start();
        tD.start();
        System.out.println(">>>>>>>>>>> MAIN THREAD DONE!");

        tA.join();
        tB.join();
        tC.join();
        tD.join();
        System.exit(0);
    }

}

class Counter {

    private int c;

    public Counter(int c) {
        this.c = c;
    }

    public synchronized int increaseCounter() throws InterruptedException {
        Thread.sleep(50);
        return ++c;
    }
}

class CounterPrinter implements Runnable {

    private Counter counter;
    private long sleep;

    public CounterPrinter(Counter counter, long sleep) {
        this.counter = counter;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + ", c=" + counter.increaseCounter());
            } catch (InterruptedException ex) {
                Logger.getLogger(CounterPrinter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("\tThread: " + Thread.currentThread().getName()+" is done!");

    }
}
