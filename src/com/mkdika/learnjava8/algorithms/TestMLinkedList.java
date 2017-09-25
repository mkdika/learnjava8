package com.mkdika.learnjava8.algorithms;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestMLinkedList {   
    public static void main(String[] args) {
        
        MLinkedList<Integer> l1 = new MLinkedList<>(null, 1);
        MLinkedList<String> l2 = new MLinkedList<>(l1, "a");
        MLinkedList<Boolean> l3 = new MLinkedList<>(l2, true);
        MLinkedList<Double> l4 = new MLinkedList<>(l3, 1.5d);
        
        
        System.out.println(l4.getLink().getLink().getValue());
        
        
        
    }    
}
