package com.mkdika.learnjava8.concurrency.volatiles;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Test1 {

    public static void main(String[] args) {

        DemoCounter dc = new DemoCounter();

        Thread tmain = new Thread(new DemoThread("main", dc));
        Thread t1 = new Thread(new DemoThread("thread-1", dc));
        Thread t2 = new Thread(new DemoThread("thread-2", dc));

        tmain.start();
        t1.start();
        t2.start();

    }
}

class DemoThread extends Thread {

    DemoCounter counter;

    DemoThread(String name, DemoCounter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                if (getName().equals("main")) {
                    synchronized (counter) {
                        counter.updateCounter();
                        System.out.println(getName() + " increase counter to " + counter.getCounter());
                    }
                    sleep(1000);
                } else {
                    synchronized (counter) {
                        System.out.println("\t" + getName() + " check counter is " + counter.getCounter());
                    }
                    sleep(1000);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(DemoThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class DemoCounter {

    volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void updateCounter() {
        counter = counter + 1;
    }

}
