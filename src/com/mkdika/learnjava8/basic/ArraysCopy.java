
package com.mkdika.learnjava8.basic;

import java.util.Arrays;

/**
 * 
 * This is to demonstrate Java low level System.arraycopy method
 * 
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class ArraysCopy {
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[9];
        System.out.println("Before:");
        System.out.println("\tA("+a.length+ ") = " + Arrays.toString(a));
        System.out.println("\tB("+b.length+ ") = " + Arrays.toString(b));
        System.arraycopy(a, 0, b, 0, Math.min(a.length, b.length));
        System.out.println("After:");
        System.out.println("\tA("+a.length+ ") = " + Arrays.toString(a));
        System.out.println("\tB("+b.length+ ") = " + Arrays.toString(b));
        
    }
    
}
