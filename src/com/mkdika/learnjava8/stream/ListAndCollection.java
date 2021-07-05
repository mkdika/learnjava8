package com.mkdika.learnjava8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class ListAndCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] n = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> ns = Arrays.asList(n);
        
        // Java 7
        for (Integer i : ns) {
            System.out.println(i);
        }
        System.out.println("");
        
        // Java 8
        ns.forEach(System.out::println);
        
        System.out.println("");
        
        ns.forEach(ListAndCollection::cetak);

    }
    
    public static void cetak(int n) {
        System.out.println("c-"+n);
    }
    
}
