package com.mkdika.learnjava8.collectionapi.collection.set;

import java.util.TreeSet;

/*

    TreeSet provides an implementation of the Set interface that uses a tree 
    for storage. Objects are stored in a sorted and ascending order.

    Access and retrieval times are quite fast, which makes TreeSet an excellent 
    choice when storing large amounts of sorted information that must be 
    found quickly.

    Following is the list of the constructors supported by the TreeSet class.

*/
public class TestTreeSet {   
    public static void main(String[] args) {
        
        TreeSet<String> ts = new TreeSet<>();
        
        // add some elements & print
        ts.add("E");
        ts.add("C");
        ts.add("D");
        ts.add("F");
        System.out.println("Add some element. Content: "+ts.toString());
        ts.add("B");
        ts.add("A");
        ts.add("G");
        ts.add("E");
        ts.add("C");
        System.out.println("Add B,A,G,E,C. Content: "+ts.toString());
        
        // first & last element
        System.out.println("First is " + ts.first()+", Last is " + ts.last());
        
        // contains
        System.out.println("Is TreeSet contains X? " + ts.contains("X"));
        
        // lower
        System.out.println("Lower D : " + ts.lower("D"));
        
        // higher
        System.out.println("Higher E : " + ts.higher("ES"));
        System.out.println("Higher G : " + ts.higher("G"));
        
        // ceiling 
        System.out.println("Ceiling D : "+ts.ceiling("D"));
        
        // floor
        System.out.println("Floor C : " + ts.floor("C"));                                                
    }    
}
