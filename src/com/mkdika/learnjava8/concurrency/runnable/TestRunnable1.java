package com.mkdika.learnjava8.concurrency.runnable;

import java.util.concurrent.ForkJoinPool;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestRunnable1 {
   
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Task(2000),"Task-A");        
        Thread threadB = new Thread(new Task(4000),"Task-B");
        
        threadB.start();
        threadA.start();
        threadB.join();
        threadA.join();
    }

}

class Task implements Runnable {

    long sleep;

    public Task(long sleep) {
        this.sleep = sleep;
    }

    @Override
    public void run() {
        try {
            System.out.println("Test 1..2..3..from thread: "+Thread.currentThread().getName());
            Thread.sleep(sleep);
            System.out.println("Done thread: " + Thread.currentThread().getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
