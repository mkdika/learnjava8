package com.mkdika.learnjava8.collectionapi.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestArrayList {   
    public static void main(String[] args) {
       
        // create List of integer with init size from arraylist
        // set init size to 5
        List<Integer> list = new ArrayList<>(5);
        
        // add some value
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(4);               
        
        // print list size
        System.out.println("list size: " + list.size());
        
        // print content
         System.out.println(list);
        
        // is contain 3
        System.out.println("is contain 3? " + list.contains(3));
        
        // print index-2
        System.out.println("index-2 = " + list.get(2));
        
        // return index from value
        System.out.println("1 index is? " + list.indexOf(1));
        
        // add new element
        list.add(6);
        System.out.println("current size: " + list.size());        
        
        // set element in index-2, this will cause replace value from 5 to 7
        // and print all
        list.set(2, 7);
        System.out.println("current elements: " + list.toString());
        
        // add new value, but exist
        list.add(3);
        System.out.println("current elements: " + list.toString());
        
        // remove index-4
        list.remove(4);
        System.out.println("current elements after remove index -4: " + list.toString());
        
        // sub list from index-1 to 3, print sublist
        List<Integer> sublist = list.subList(1, 3);
        System.out.println("sublist(1,3) result is "+sublist.toString());                
    }   
}
