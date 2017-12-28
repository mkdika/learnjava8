package com.mkdika.learnjava8.collectionapi.collection.queue;

import java.util.ArrayDeque;

/*
    The java.util.ArrayDeque class provides resizable-array and implements 
    the Deque interface. Following are the important points about Array Deques:

    - Array deques have no capacity restrictions so they grow as necessary 
      to support usage.

    - They are not thread-safe; in the absence of external synchronization.

    - They do not support concurrent access by multiple threads.

    - Null elements are prohibited in the array deques.

    - They are faster than Stack and LinkedList.

    This class and its iterator implement all of the optional methods of 
    the Collection and Iterator interfaces.

    https://www.tutorialspoint.com/java/util/java_util_arraydeque.htm
*/
public class TestArrayDeque {
    public static void main(String[] args) {
    
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        
        // add element of array
        ad.add(3);
        ad.add(4);
        System.out.println("Add Element. content: " + ad.toString());
        
        // add element to its first (head) & last (tail) index
        ad.addFirst(1);
        ad.addLast(5);
        System.out.println("AddFirst & AddLast. content: "+ ad.toString());
       
        // offers are similar to adds
        ad.offer(6);
        ad.offer(7);
        ad.offerFirst(0);
        ad.offerLast(8);
        System.out.println("Offers. content: " + ad.toString());
        System.out.println("Current size: " + ad.size());
        
        // peekFirst, peek, getFirst data
        System.out.println("Peek First data is " + ad.peekFirst());
        System.out.println("Peek data is " + ad.peek());
        System.out.println("GetFirst is " + ad.getFirst());
        
        // peekLast, getLast data
        System.out.println("Peek Last data is " + ad.peekLast());
        System.out.println("GetLast is " + ad.getLast());
        
        // polls, get data & remove from queue
        System.out.println("PollFirst data is " + ad.pollFirst() + ", content: " + ad.toString() );
        System.out.println("Poll data is " + ad.poll()+ ", content: " + ad.toString());
        System.out.println("PollLast data is " + ad.pollLast() + ", content: " + ad.toString());                
    }    
}
