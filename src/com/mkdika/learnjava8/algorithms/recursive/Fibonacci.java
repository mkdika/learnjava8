package com.mkdika.learnjava8.algorithms.recursive;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Fibonacci {

    public static void main(String[] args) {
        calcFibs(0,1,30);
    }

    static int calcFibs(int x,int y,int z) {        
        if ((x+y) >= z) return 0;
        if (x < 1) {
            System.out.print("1 ");
        }
        System.out.print((x+y)+" ");
        return calcFibs(y, (x+y), z);        
    }
}
