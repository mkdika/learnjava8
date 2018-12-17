
package com.mkdika.learnjava8.pattern.creational.singleton;

/**
 * Double Check Locking Technique Singleton class
 * 
 * This class is to domonstrate the true lazy initialization 
 * singleton class that cover:
 * - Thread safe
 * - Multicore pararel and multithread friendly
 * - Atomic process
 * 
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public final class TrueSingleton {
    
    private static volatile DummyService instance;
    
    // to protect class from being new instance from outside of class
    private TrueSingleton() {        
    }
    
    // singleton static method that use double check locking
    // method are unable to overide   
    public static final DummyService getInstance() {
        if (instance != null) return instance;
        
        synchronized(TrueSingleton.class) {
            if (instance == null) {
                instance = new DummyService();
            }
            return instance;
        }        
    }        
}

// example for service class for instance in singleton class
class DummyService {
    public void print(){
        System.out.println("Print something!");
    }
}

// driver class for demo
class DemoTrueSingleton {
    public static void main(String[] args) {        
        TrueSingleton.getInstance().print();                
    }
}