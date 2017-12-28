package com.mkdika.learnjava8.collectionapi.collection.queue;

import java.util.PriorityQueue;

/*
    
    The java.util.PriorityQueue class is an unbounded priority queue based on 
    a priority heap.Following are the important points about PriorityQueue:

    - The elements of the priority queue are ordered according to their natural 
      ordering, or by a Comparator provided at queue construction time, 
      depending on which constructor is used.

    - A priority queue does not permit null elements.

    - A priority queue relying on natural ordering also does not permit 
      insertion of non-comparable objects.

    https://www.tutorialspoint.com/java/util/java_util_priorityqueue.htm

*/
public class TestPriorityQueue {  
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // offer (add) some element
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);
        System.out.println("Offer Some Element, autosort. Content: " + pq.toString());
                
        // add
        pq.add(1);        
        pq.add(5);
        pq.add(2);
        System.out.println("Add some element, autosort. Content: "+pq.toString());
        
        // peek head element
        System.out.println("Peek is " + pq.peek());
        
        // poll head element
        System.out.println("Poll is " + pq.poll()+", content: " + pq.toString());                        
    }    
}
