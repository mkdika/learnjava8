package com.mkdika.learnjava8.collectionapi.collection.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 *
 * given N of array, find out K element of the highest/lowest (min/max) value.
 * This is min/max heap data structure technique, and in Java we can use
 * PriorityQueue to workaround with it.
 *
 * Solution/approach: 
 * 1. Using sorting and get least or most K element. (Quicksort -> O(n * Long(n)) 
 * 2. Using select selection sort -> O(n * k) 
 * 3. Using min/max heap -> O(k + (n-k) log(k))
 *
 */
public class MinMaxHeapPriorityQueue {

    public static void main(String[] args) {
        int k = 3;
        int[] n = {15, 10, 4, 1, 5, 2, 3, 0, 30, -1};

        /*
            MIN HEAP
            by default priorityQueue is in ascending order 
         */
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : n) {
           minHeap.add(i);
        }
        System.out.println(minHeap.toString());
        System.out.println(Arrays.toString(minHeap.stream().limit(3).toArray())); // print: -1,0,1
        
         /*
            MAX HEAP
            by default priorityQueue is in ascending order 
         */
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i : n) {
            maxHeap.add(i);
        }
        System.out.println(maxHeap.toString()); // print: 30,15,10

    }
    
    //INNER CLASS
    static class maxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare (Integer x, Integer y) {
            return y-x; //reverse order
        }
    }


}
