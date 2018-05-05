/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdika.learnjava8.lambda;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestLambda {

}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd() {
        return (int a) -> (a % 2 == 1);
    }

    PerformOperation isPrime() {
        return (int a) -> {
            if (a < 2) {
                return false;
            }
            if (a == 2 || a == 3) {
                return true;
            }
            if (a % 2 == 0 || a % 3 == 0) {
                return false;
            }
            long sqrtN = (long) Math.sqrt(a) + 1;
            for (long i = 6L; i <= sqrtN; i += 6) {
                if (a % (i - 1) == 0 || a % (i + 1) == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    PerformOperation isPalindrome() {
        return (int a) -> {
            return cekPalindrome(String.valueOf(a));
        };
    }

    boolean cekPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return cekPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}

interface PerformOperation {

    boolean check(int a);
}
