package com.mkdika.learnjava8.stream;

import java.util.stream.IntStream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Stream1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(System.out::println);
        
    }
    
}
