package com.mkdika.learnjava8.basic;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class InstanceOfClass {

    public static void main(String[] args) {
        A a = null;
        if (a instanceof A) { // false, because a is still null
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        B b = new B();
        if (b instanceof A) { // true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class A {
}

class B extends A {
}
