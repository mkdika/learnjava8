
package com.mkdika.learnjava8.basic.test;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntStream.range(1, 11).forEach(System.out::print);
        
        System.out.println();
        LongStream.range(0, 16).forEach(System.out::print);
        
        System.out.println();
    }
    
}
