package com.mkdika.learnjava8.collectionapi.map;

import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;


public class TestNavigableMap { 
    public static void main(String[] args) {
        
        NavigableMap<Integer, String> nm = new ConcurrentSkipListMap<>();
        
        // add some elements        
        nm.put(4, "Wednesday");
        nm.put(5, "Thursday");
        nm.put(6, "Friday");
        nm.put(1, "Sunday");
        nm.put(2, "Monday");                       
        System.out.println("Add some elements. Content: " + nm.toString());
        
        // get key 5
        System.out.println("Get key 5 : " + nm.get(5));
        
        // ceilingkey & floorkey
        System.out.println("CeilingKey 3 : " + nm.ceilingKey(3));
        System.out.println("FloorKey 3 : " + nm.floorKey(3));
        
        // ceilingentry & floorentry
        System.out.println("CeilingEntry 3 : " + nm.ceilingEntry(3));
        System.out.println("FloorEntry 4 : " + nm.floorEntry(4));
        
        // higherEtntry & lowerEntry
        System.out.println("HigherEntry 4 : " + nm.higherEntry(4));
        System.out.println("HigherEntry 3 : " + nm.higherEntry(3));
        System.out.println("LowerEntry 4 : " + nm.lowerEntry(4));
        
        // firstEntry & lastEntry
        System.out.println("FirstEntry : " + nm.firstEntry());
        System.out.println("LastEntry : "+nm.lastEntry());                
    }    
}
