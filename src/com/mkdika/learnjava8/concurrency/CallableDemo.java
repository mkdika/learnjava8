package com.mkdika.learnjava8.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class CallableDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> future1 = service.submit(new SumTask(20000));
        Integer result1 = future1.get();
        System.out.println("Result1: " + result1);

        Future<Integer> future2 = service.submit(new SumTask(10));
        Integer result2 = future2.get();
        System.out.println("Result2: " + result2);

    }

}

class SumTask implements Callable<Integer> {

    private int num = 0;

    public SumTask(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
}
