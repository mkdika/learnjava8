package com.mkdika.learnjava8.collectionapi.collection.set;

import java.util.LinkedHashSet;

/*

    This class extends HashSet, but adds no members of its own.

    LinkedHashSet maintains a linked list of the entries in the set, 
    in the order in which they were inserted. This allows insertion-order
    iteration over the set.

    That is, when cycling through a LinkedHashSet using an iterator, 
    the elements will be returned in the order in which they were inserted.

    The hash code is then used as the index at which the data associated 
    with the key is stored. The transformation of the key into its hash code 
    is performed automatically.

    https://www.tutorialspoint.com/java/java_linkedhashset_class.htm

*/
public class TestLinkedHashSet {   
    public static void main(String[] args) {
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        lhs.add("C");
        lhs.add("A");
        lhs.add("D");
        lhs.add("B");
        lhs.add("A");
        lhs.add("C");
        System.out.println("Add some element. Content: " + lhs.toString());                                
    }    
}
