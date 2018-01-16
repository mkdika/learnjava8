package com.mkdika.learnjava8.basic.test;

import java.util.TreeSet;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Main1 {

    public static void main(String[] args) {
        System.out.println(numbers(10L,(byte)30,2));
               
        TreeSet<String> tree = new TreeSet<>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree);
        System.out.println(tree.floor("On"));
        
        Double d = 31.44;
        
        
        
        
    }

    public static double numbers(long arg1, byte arg2, double arg3) {
        return arg1 + arg2 + arg3;
    }

}
