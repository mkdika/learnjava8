
package com.mkdika.learnjava8.basic.test;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * show min & max range of Java numeric type data
 */
public class MinMaxValue {
    
    public static void main(String[] args) {
        
        System.out.println("Int Min           : " +Integer.MIN_VALUE);
        System.out.println("Int Max           : " +Integer.MAX_VALUE);
        System.out.println(Math.min(0, Integer.MIN_VALUE));
        System.out.println("");
        System.out.println("Double Min value  : " +Double.MIN_VALUE);
        System.out.println("Double Min normal : " +Double.MIN_NORMAL);
        System.out.println("Double Min exponen: " +Double.MIN_EXPONENT);
        
        System.out.println("Double Max value  : " +Double.MAX_VALUE);        
        System.out.println("Double Max exponen: " +Double.MAX_EXPONENT);        
        System.out.println(Math.min(0.0d, Double.MIN_VALUE));
        System.out.println();
        System.out.println("Long Max value: " + Long.MAX_VALUE);
        System.out.println("Long Min value: " + Long.MIN_VALUE);
        System.out.println(Math.min(0l, Long.MIN_VALUE));                
    }    
}
