
package com.mkdika.learnjava8.basic.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
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
        
        Map<Integer,Integer> m = new HashMap<>();
        
        m.put(null, 123);
        System.out.println(m.get(null));
        
        m.put(null, 234);
        System.out.println(m.get(null));
        
        Map<Integer,Integer> mt = new Hashtable<>();
        
        
        mt.put(null, 789);
        System.out.println(mt.get(null));                        
        
        Vector v = new Vector();
    }
    
}
