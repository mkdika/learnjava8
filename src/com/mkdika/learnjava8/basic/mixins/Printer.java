
package com.mkdika.learnjava8.basic.mixins;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public interface Printer {
    
    default void printInfo() {
        System.out.println("Printing Info...");
    }
    
}
