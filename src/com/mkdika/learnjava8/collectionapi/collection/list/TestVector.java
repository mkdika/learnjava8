package com.mkdika.learnjava8.collectionapi.collection.list;

import java.util.Vector;

/*

Vector implements a dynamic array. It is similar to ArrayList, but with 
two differences 

    - Vector is synchronized.

    - Vector contains many legacy methods that are not part of 
      the collections framework.

Vector proves to be very useful if you don't know the size of the array 
in advance or you just need one that can change sizes over the lifetime 
of a program.

*/

public class TestVector {
    public static void main(String[] args) {
     
        Vector<Integer> vec = new Vector<>(5,1);
        System.out.println("init size: " + vec.size());
        
        vec.addElement(4);
        vec.addElement(2);
        vec.addElement(1);
        vec.addElement(3);
        System.out.println("add data, size: " + vec.size()+", content: " + vec.toString());
        
        // return capacity
        System.out.println("Vector capacity "+ vec.capacity()+", vector size: " + vec.size());
        
        vec.addElement(5);
        vec.addElement(6);
        System.out.println("Add element 5,6. Current Vector capacity "+ vec.capacity());
        
        
        
        
        
    }    
}
