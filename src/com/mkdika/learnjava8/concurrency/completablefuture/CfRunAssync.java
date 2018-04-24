package com.mkdika.learnjava8.concurrency.completablefuture;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * This is base on article:
 * https://www.callicoder.com/java-8-completablefuture-tutorial/
 */
public class CfRunAssync {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Run a task specified by a Runnable Object asynchronously.
                
        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {        
                try {
                    // calculate something
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                System.out.println("I'll run in a separate thread than the main thread.");
            }
        });

        // Block and wait for the future to complete
       future.get();               
    }
}
