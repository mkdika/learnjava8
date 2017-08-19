
package com.mkdika.learnjava8.basic;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class InitializerBlock {
    {
        System.out.println("This is print from INITIALIZER-BLOCK-1");
    }

    public InitializerBlock() {        
        System.out.println("This is print from CONSTRUCTOR");
    }            
    
    {
        System.out.println("This is print from INITIALIZER-BLOCK-2");
    }
}
