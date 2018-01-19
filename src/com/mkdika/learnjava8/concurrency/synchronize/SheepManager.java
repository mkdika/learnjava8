package com.mkdika.learnjava8.concurrency.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class SheepManager {

    private int sheepCount = 0;
    private int totalHour = 0;

    private void incrementAndReport() {
        synchronized (this) { // blocking resource while being update from others thread
            System.out.print((++sheepCount) + " ");
        }
        incrementHour();
    }

    // synchronized keyword as access modified (Synchronizing Methods)
    private synchronized void incrementHour() {
        totalHour += 2;
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        SheepManager manager = new SheepManager();
        try {
            service = Executors.newFixedThreadPool(10);

            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
            
            
            try {
                service.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException ex) {
                System.out.println("Not yet finished!");
            }
        System.out.println("\nTotal Hour: " + manager.getTotalHour());

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }        
    }

    public int getTotalHour() {
        return totalHour;
    }
}
