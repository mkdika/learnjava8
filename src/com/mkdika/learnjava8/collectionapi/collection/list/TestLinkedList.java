package com.mkdika.learnjava8.collectionapi.collection.list;

import java.util.LinkedList;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestLinkedList {
    public static void main(String[] args) {        
        
        LinkedList<Integer> list  = new LinkedList<>();
        System.out.println("init size: " + list.size());
        
        // add some element
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        
        // print current list & size
        System.out.println("current list size: "+list.size()+ ", content: "+ list.toString());
        
        // add new element 5 to index-2, then print        
        list.add(2, 5);
        System.out.println("current list: " + list.toString());
        
        // add element to first index
        // add element to last index, then print
        list.addFirst(9);
        list.addLast(0);
        System.out.println("current list: " + list.toString());
        
        // get index-3
        System.out.println("index-3 is = "+ list.get(3));
        
        // get first
        System.out.println("get first element = " + list.getFirst());
        
        // get last
        System.out.println("get last element = " + list.getLast());
        
        // 4 is index of ?
        System.out.println("4 is index of ? " + list.indexOf(4));                                         
    }    
}
