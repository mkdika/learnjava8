package com.mkdika.learnjava8.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() ->
                        1L
                );
        while (!completableFuture.isDone()) {
            System.out.println("CompletableFuture is not finished yet...");
        }
        long result = completableFuture.get();
    }
}
