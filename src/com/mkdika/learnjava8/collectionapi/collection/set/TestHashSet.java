package com.mkdika.learnjava8.collectionapi.collection.set;

import java.util.HashSet;

/*

    HashSet extends AbstractSet and implements the Set interface. It creates 
    a collection that uses a hash table for storage.

    A hash table stores information by using a mechanism called hashing. 
    In hashing, the informational content of a key is used to determine 
    a unique value, called its hash code.

    The hash code is then used as the index at which the data associated with 
    the key is stored. The transformation of the key into its hash code 
    is performed automatically.

    Following is the list of constructors provided by the HashSet class.

    https://www.tutorialspoint.com/java/java_hashset_class.htm

*/
public class TestHashSet {  
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>(5);        
        System.out.println("Init hashset 5. Size: " + hs.size());
        
        // add some elements
        hs.add(1);
        hs.add(4);
        hs.add(1);
        hs.add(2);
        System.out.println("Add. Content: " + hs.toString());        
        hs.add(3);
        System.out.println("Add 3. Content: " + hs.toString());
        System.out.println("Current Size: " + hs.size());
        
        // remove
        hs.remove(2);
        System.out.println("remove 2. Content: " + hs.toString());
        
        // contains
        System.out.println("Is Set contains 4? "+hs.contains(4));                              
    }    
    
}
