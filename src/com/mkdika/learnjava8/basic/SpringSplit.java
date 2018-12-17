
package com.mkdika.learnjava8.basic;

import java.util.Arrays;

/**
 * 
 * String split demo.
 * 
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class SpringSplit {
    
    public static void main(String[] args) {
        
        String s1 = "tom&jerry";
        String[] sarr1 = s1.split("&");
        System.out.println("S1       = " + s1);
        System.out.println("S1 Split = " + Arrays.toString(sarr1));
        
        String s2 = "&jerry";
        String[] sarr2 = s2.split("&");
        System.out.println("S2       = " + s2);
        System.out.println("S2 Split = " + Arrays.toString(sarr2));
        
        String s3 = "tom&";
        String[] sarr3 = s3.split("&");
        System.out.println("S3       = " + s3);
        System.out.println("S3 Split = " + Arrays.toString(sarr3));
        
    }
    
}
