package com.mkdika.learnjava8.algorithms;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Find the max index of greatest value within array 
 */
public class GreatestIndex {

    public static void main(String[] args) {
        int[] Arr = {4,10, 6, 2, 2, 6, 6, 4, 6, 9, 1, 1, 9}; //[4, 6, 2, 2, 6, 6, 4]
        System.out.println(Arr.length);
        System.out.println(coba(Arr));

    }

    static int coba(int[] A) {
        if (A.length < 1) {
            return -1;
        }
        
        int N = A.length;
        int maxValue = A[0];
        int maxIndex = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] >= maxValue) {
                maxValue = A[i];
                maxIndex = i;
            }
        }
        return maxIndex;   
    }
}
