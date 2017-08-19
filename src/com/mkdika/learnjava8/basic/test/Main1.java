package com.mkdika.learnjava8.basic.test;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Main1 {

    public static void main(String[] args) {
        System.out.println(numbers(10L,(byte)30,2));
    }

    public static double numbers(long arg1, byte arg2, double arg3) {
        return arg1 + arg2 + arg3;
    }

}
