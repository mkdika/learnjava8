
package com.mkdika.learnjava8.pattern.creational.singleton;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Enum Singleton Technique.
 * 
 * Recommended solution over traditional singleton technique use Java Enum.
 * 
 */
public class TrueSingletonEnum {
    public static void main(String[] args) {
        DummyService2.INSTANCE.print();
    }
}

// the class itself provide singleton instance
enum DummyService2 {
    INSTANCE;
    
    public void print(){
        System.out.println("Print something from dummy service 2!");
    }
}
