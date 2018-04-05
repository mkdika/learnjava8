package com.mkdika.learnjava8.algorithms.recursive;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class StringReverse {

    public static void main(String[] args) {
        System.out.println(reverse("maikelchandika"));
    }

    static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        }
        return s.substring(s.length()-1, s.length()) + reverse(s.substring(0, s.length()-1));
    }    
}
