package com.mkdika.learnjava8.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class CfSupplyAssync {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Run a task specified by a Supplier object asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Result of the asynchronous computation";
            }
        });

// Block and get the result of the Future
        String result = future.get();
        System.out.println(result);
    }
}
