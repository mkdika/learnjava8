package com.mkdika.learnjava8.collectionapi.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
    A Queue is a collection for holding elements prior to processing. 
    Besides basic Collection operations, queues provide additional insertion, 
    removal, and inspection operations. The Queue interface follows.
*/
public class TestQueue {
    public static void main(String[] args) {
       
        Queue<Integer> que = new LinkedList<>();        
        System.out.println("init Que size: " + que.size());
            
        // OFFER - add some data into queue        
        que.offer(1);
        que.offer(2);
        que.offer(3);
        System.out.println("Add some data. Current size: "+ que.size()+", content: " + que.toString());
        
        // PEEK - Returns the head (first) element of the queue, but does not remove it.
        System.out.println("Current first queue is " + que.peek());
        
        // POLL - Returns the head (first) element of the queue, removing it in the process.
        System.out.println("Poll one data from queue is " + que.poll()+", content: " + que.toString());
        
        System.out.println("Current size: " + que.size());        
    }    
}
