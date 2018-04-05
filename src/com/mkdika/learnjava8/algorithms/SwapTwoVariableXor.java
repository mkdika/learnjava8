
package com.mkdika.learnjava8.algorithms;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Swap 2 int variable without the 3rd variable.
 * using XOR gate.
 * 
 */
public class SwapTwoVariableXor {
    
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        
        System.out.println("a= "+a+", b= "+b);
        System.out.println("SWap a and b:");
        
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
                
        System.out.println("a= "+a+", b= "+b);        
    }    
}
