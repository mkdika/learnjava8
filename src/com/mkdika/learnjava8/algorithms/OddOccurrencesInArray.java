package com.mkdika.learnjava8.algorithms;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 */
public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] arr = {9, 3, 9, 3, 9, 7, 9, 4, 4};
        System.out.println(calOccurences(arr));
    }

    static int calOccurences(int[] A) {
        if (A.length > 0 && A.length % 2 == 1) {            
            java.util.Map<Integer, Integer> store = new java.util.HashMap<>();
            for (int i = 0; i < A.length; i++) {
                if (store.get(A[i]) == null) {                    
                    store.put(A[i], i);
                } else {
                    store.remove(A[i]);
                }
            }
            return store.keySet().iterator().next();
        }
        return 0;
    }
}
