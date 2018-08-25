package com.mkdika.learnjava8.reflection.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class SimpleStack {

    private List<Integer> items;
    private int size;

    public SimpleStack() {
        this(10); // default size
    }

    public SimpleStack(int size) {
        this.size = size;
        this.items = new ArrayList<>(size);
        items.add(9);
        System.out.println("Created instance of SimpleStack class with arguments constructor size=" + size);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void printInfo() {
        System.out.println("Current stack size: " + items.size());
    }
    
    public void push(int x) {
        items.add(x);
    }
    
    public int peek() {
        return items.get(items.size()-1);
    }
    
    public int pop() {
        return items.remove(items.size()-1);
    }
}
