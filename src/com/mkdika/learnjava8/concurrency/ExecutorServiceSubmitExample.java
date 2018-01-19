package com.mkdika.learnjava8.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class ExecutorServiceSubmitExample {
    
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            
            // submit method is return Future/Promise
            Future<?> result = service.submit(() -> {
                for (int i=0; i<9_000_000; i++) { 
                    ExecutorServiceSubmitExample.counter++;                 
                }
            });
            
            result.get(1,TimeUnit.MILLISECONDS);
            System.out.println("Reached End!");            
        } catch (TimeoutException e) {
            System.out.println("NOT reached in time");
        } finally {
            if (service != null) service.shutdown();
        }                
    }    
}
