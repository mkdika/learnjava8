package com.mkdika.learnjava8.algorithms;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * n is an integer within the range [1..2,147,483,647].
 *
 * Complexity: - expected worst-case time complexity is O(log(N)); - expected
 * worst-case space complexity is O(1).
 *
 */
public class BinaryGap {

    public static void main(String[] args) {
        int n = 9;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(calBinaryGap((n)));
    }

    static int calBinaryGap(int N) {                
        String s = Integer.toBinaryString(N);                        
        String[] sarr = s.split("1");                                      
        if (sarr.length > 0) {
            String[] ssarr = java.util.Arrays.copyOfRange(s.split("1"), 0, (s.charAt(s.length()-1)=='1'?sarr.length:sarr.length - 1));
            java.util.Arrays.sort(ssarr);
            return ssarr[ssarr.length-1].length();
        } else {
            return 0;
        }       
    }
}
