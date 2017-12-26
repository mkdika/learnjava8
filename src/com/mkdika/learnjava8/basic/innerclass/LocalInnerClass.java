package com.mkdika.learnjava8.basic.innerclass;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class LocalInnerClass {
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }    
}

class Outer {
    private int length = 5;
    
    public void calculate() {
        int width = 20;
        class Inner {
            void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }
    
}
