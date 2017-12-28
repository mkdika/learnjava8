package com.mkdika.learnjava8.collectionapi.collection.queue;

import java.util.Deque;
import java.util.LinkedList;

/*

    Usually pronounced as deck, a deque is a double-ended-queue. A double-ended-queue 
    is a linear collection of elements that supports the insertion and removal 
    of elements at both end points. The Deque interface is a richer abstract 
    data type than both Stack and Queue because it implements both stacks and 
    queues at the same time. The Deque interface, defines methods to access 
    the elements at both ends of the Deque instance. Methods are provided 
    to insert, remove, and examine the elements. Predefined classes like 
    ArrayDeque and LinkedList implement the Deque interface.

*/
public class TestDeque {
    public static void main(String[] args) {
     
        Deque<Integer> deque = new LinkedList<>();
        
        // OFFER - add some data into queue     
        deque.offer(5);
        deque.offer(4);
        deque.offer(2);
        deque.offerFirst(1);
        deque.offerLast(9);
        System.out.println("After offer data. Size: " + deque.size()+", content: " + deque.toString());
        
        // PEEK - view data from first or last, without remove it
        System.out.println("Peek First is " + deque.peekFirst()+", Peek Last is "
                + deque.peekLast()+", Peek is "+ deque.peek());
        
        // POLL - removeing, head or tail data from queue
        System.out.println("Poll head data is " + deque.pollFirst()+
                ", poll last data is " + deque.pollLast()+
                ", poll is " + deque.poll()+
                ", content: " + deque.toString());                       
    }    
}
