package com.mkdika.learnjava8.collectionapi.collection.list;

import java.util.Stack;

/*
    Stack is a subclass of Vector that implements a standard last-in, 
    first-out stack.

    Stack only defines the default constructor, which creates an empty stack. 
    Stack includes all the methods defined by Vector, and adds several 
    of its own.
*/
public class TestStack {
    public static void main(String[] args) {        
        
        Stack<Integer> stack = new Stack<>();
        System.out.println("init stack size: " + stack.size()+ ", capacity: "+ stack.capacity());
        
        // test if stack is empty
        System.out.println("Current stack isEmpty? " + stack.empty());
        
        // PUSH - Pushes the element onto the stack. Element is also returned.
        stack.push(3);
        stack.push(6);
        stack.push(4);
        System.out.println("Current stack size: " + stack.size()+", capacity: "+ stack.capacity()+ ", content: " + stack.toString());
        
        // first element, last element
        System.out.println("first element: " + stack.firstElement() + ", last element: " + stack.lastElement());
        
        // PEEK - Returns the element on the top of the stack, but does not remove it.
        System.out.println("Current top stack is " + stack.peek());
        
        // POP - Returns the element on the top of the stack, removing it in the process.
        System.out.println("Pop upper elemnent: " + stack.pop()+ ", current content: " + stack.toString());
        
        
        // add some element
        stack.add(1);
        stack.addElement(2);
        System.out.println("add element. Current stack content: " + stack.toString());
        
        // SEARCH - Searches for element in the stack. If found, 
        //          its offset from the top of the stack is returned. Otherwise,
        //          .1 is returned.        
        System.out.println("do 5 in the stack? " + stack.search(5));
        System.out.println("do 1 in the stack? " + stack.search(1));
        System.out.println("do 2 in the stack? " + stack.search(2));
        
        
        
    }    
}
