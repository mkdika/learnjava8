package com.mkdika.learnjava8.functional;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@FunctionalInterface
public interface Shape {    
    double calculateVolume(Shape shape);        
    
//    double calculateArea(Shape shape); // should have only one absract method.
    
    // default methods are allowed in FunctionalInterface
    default void printSomething() {
        System.out.println("Something printing....");
    }
    
    default void printB() {
        System.out.println("print B!");
    }
}
