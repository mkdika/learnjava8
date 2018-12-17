package com.mkdika.learnjava8.collectionapi.threadsafe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
    This is thread-safe alternative from:

        HashMap    
 */
public class TestConcurrentHashMap {

    public static void main(String[] args) {

        // this will throw java.util.ConcurrentModificationException
        // Map<String, Object> foodData = new HashMap<>();
        
        // this not throw exception because of thread-safe
        Map<String, Object> foodData = new ConcurrentHashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) {
            foodData.remove(key);
        }

    }
}
