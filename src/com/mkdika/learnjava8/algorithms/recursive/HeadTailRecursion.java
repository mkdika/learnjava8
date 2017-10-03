package com.mkdika.learnjava8.algorithms.recursive;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class HeadTailRecursion {

    public static void main(String[] args) {
        System.out.println("Head Recursion: ");
        headRecursion(11);

        System.out.println("\nTail Recursion: ");
        tailRecursion(10);

        System.out.println("\nHead Factorial(5): " + headFactorial(5));
        System.out.println("\nTail Factorial(5): " + tailFactorial(5));
    }

    /*    
        HEAD Recursion
        the recursive call, when it happens, comes before other processing 
        in the function.   
     */
    static void headRecursion(int n) {
        if (n == 1) {
            return;
        } else {
            headRecursion(--n);
        }
        System.out.println(n);
    }

    /*    
        TAIL Recursion
        the processing occurs before the recursive call. Choosing between 
        the two recursive styles may seem arbitrary, but the choice can 
        make all the difference.    
     */
    static void tailRecursion(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
        }
        tailRecursion(--n);
    }

    /*
        Stack Over Flow Recursion.    
     */
    static void sofRecursion() {
        System.out.println("Hello World!");
        sofRecursion();
    }

    /*
        this factorial recursion also consider as Head Recursion type.
     */
    static int headFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * headFactorial(n-1);
        }
    }

    /*
        this factorial recursion also consider as Tail Recursion type.
     */
    static int tailFactorial(int n, int acum) {
        if (n == 0) {
            return acum;
        } else {
            return tailFactorial(n-1, acum * n);
        }
    }

    static int tailFactorial(int n) {
        return tailFactorial(n, 1);
    }
}
