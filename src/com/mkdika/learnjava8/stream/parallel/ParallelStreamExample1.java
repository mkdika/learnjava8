package com.mkdika.learnjava8.stream.parallel;

import java.util.stream.IntStream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Serial Stream vs Parallel Stream vs Parallel Stream forEachOrdered 
 * BENCHMARK.
 */
public class ParallelStreamExample1 {

    public static void main(String[] args) {
        
        long l1 = System.currentTimeMillis();
        IntStream.range(1, 1000).forEach(i -> System.out.print(i + " "));
        System.out.println("\nSerial Stream: " + (System.currentTimeMillis() - l1) + " msecs.\n");        

        long l2 = System.currentTimeMillis();
        IntStream.range(1, 1000).parallel().forEach(i -> System.out.print(i + " "));
        System.out.println("\nParallel Stream: " + (System.currentTimeMillis() - l2) + " msecs.\n");
        
        long l3 = System.currentTimeMillis();
        IntStream.range(1, 1000).parallel().forEachOrdered(i -> System.out.print(i + " "));
        System.out.println("\nParallel Stream forEachOrdered: " + (System.currentTimeMillis() - l3) + " msecs.\n");
        
        
    }

}
