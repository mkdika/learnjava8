package com.mkdika.learnjava8.collectionapi.map;

import java.util.HashMap;

/*
    
    The HashMap class uses a hashtable to implement the Map interface. 
    This allows the execution time of basic operations, such as get( ) 
    and put( ), to remain constant even for large sets.

    Following is the list of constructors supported by the HashMap class.

    https://www.tutorialspoint.com/java/java_hashmap_class.htm

*/
public class TestHashMap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hm = new HashMap<>();
        
        // add some elements
        hm.put(1, "one");
        hm.put(4, "four");
        hm.put(6, "six");
        hm.put(3, "three");
        hm.put(2, "two");        
        hm.put(22, "two");        
        System.out.println("Add some elements. Content: " + hm.toString());
        
        // contain key, contain value
        System.out.println("Map contain key 3? " +hm.containsKey(3));
        System.out.println("Map contain value five? " +hm.containsValue("five"));
        
        // remove
        System.out.println("Remove key 3." + hm.remove(3)+". Content: " +hm.toString());
        
        // get
        System.out.println("Get key 1 value: " + hm.get(1));
                        
    }    
}
