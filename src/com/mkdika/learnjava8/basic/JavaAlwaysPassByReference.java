
package com.mkdika.learnjava8.basic;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * This class is to demostrate that Java always pass by reference
 * even for Reference type class.
 * 
 */
public class JavaAlwaysPassByReference {
    
    public static void main(String[] args) {
        Foo a = new Foo("a");
        System.out.println("a="+a.getAttribute()); // a
        changeReference(a);
        System.out.println("a="+a.getAttribute()); // still a
        changeAttribue(a);
        System.out.println("a="+a.getAttribute()); // still c
        
        // primitive type are always immutable, and it pass by value too.
        int x = 10;
        System.out.println("x="+x); // 10
        changeValue(x);
        System.out.println("x="+x); // still 10
    }
    
    static void changeReference(Foo a) {
        Foo b = new Foo("b");
        a  = b;
    }
    
    static void changeAttribue(Foo a) { 
        a.setAttribute("c");
    }   
    
    static void changeValue(int x) {
        x++;
    }
}

class Foo {
    
    String attribute;

    public Foo(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }                
}
