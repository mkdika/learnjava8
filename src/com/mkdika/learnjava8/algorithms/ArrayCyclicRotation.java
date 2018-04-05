package com.mkdika.learnjava8.algorithms;

import java.util.Arrays;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
public class ArrayCyclicRotation {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 1, 2}; // 5 -> {9,7,6,3,8}
        System.out.println(Arrays.toString(calCyclic(arr, 99)));
    }

    static int[] calCyclic(int[] A, int K) {

        if (A.length > 0) {
            int n = K % A.length;
            if (n == 0 ) {
                return A;
            } else {
                int[] tmp = new int[A.length];
                for (int i = A.length - 1; i > -1; i--) {
                    if (i - n > -1) {
                        tmp[i] = A[i - n];
                    } else {
                        tmp[i] = A[A.length - java.lang.Math.abs(i - n)];
                    }
                }
                return tmp;
            }
        }
        return A;
    }

}
