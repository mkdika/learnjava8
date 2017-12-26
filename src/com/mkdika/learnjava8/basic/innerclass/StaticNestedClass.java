package com.mkdika.learnjava8.basic.innerclass;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class StaticNestedClass {

    static class Nested {
        static String test = "test"; // static inner class can have static 
                                     // property & methods
        private int price = 6;
        
        static void Loops() {
            System.out.println("Loops");  // can have static methods
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();

        // can access private property directly
        System.out.println(nested.price);
    }

}
