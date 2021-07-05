package com.mkdika.learnjava8.algorithms.recursive;

/**
 * Fibonacci Naive Recursive vs Memoization Recursive vs Bottom-Up
 *
 * This class is to compare the performance result of simple common recursive
 * use case "The Fibonacci". One is use Naive Recursive algorithm, second is use
 * Dynamic programming Memoization algorithm, and bottom-up.
 *
 * The function is to calculate Fibonacci position N, then return the value.
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class FibonacciNaiveVsMemoization {

    static int[] memory;

    public static void main(String[] args) {
        int n = 45;
        System.out.println("N = " + n);
        System.out.println("Calculate with Fibonacci Naive Recursive.");
        long t1 = System.nanoTime();
        System.out.println(fib(n));
        System.out.println("Done in " + (System.nanoTime()-t1)+" nano secs.");
        System.out.println();
        System.out.println("Calculate with Fibonacci Memoization.");
        memory = new int[n+1];
        long t2 = System.nanoTime();
        System.out.println(fibM(n));
        System.out.println("Done in " + (System.nanoTime()-t2)+" nano secs.");
        System.out.println();
        System.out.println("Calculate with Fibonacci Bottom-up.");
        long t3 = System.nanoTime();
        System.out.println(fibB(n));
        System.out.println("Done in " + (System.nanoTime()-t3)+" nano secs.");
    }

    static int fib(int x) {
        if (x == 1 || x == 2) return 1;
        return fib(x - 1) + fib(x - 2);
    }

    static int fibM(int x) {
        if (memory[x] != 0) return memory[x];
        if (x == 1 || x == 2) return 1;
        int n = fibM(x - 1) + fibM(x - 2);
        memory[x] = n;
        return n;
    }

    static int fibB(int x) {
        if (x == 1 || x == 2) return 1;
        memory = new int[x+1];
        memory[1] = 1;
        memory[2] = 1;
        for (int i=3;i<=x;i++) memory[i] = memory[i-1]+memory[i-2];
        return memory[x];
    }
}
