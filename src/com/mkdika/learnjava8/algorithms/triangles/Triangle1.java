package com.mkdika.learnjava8.algorithms.triangles;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Result is like this for x=5 :
 
        ----X----
        ---XXX---
        --XXXXX--
        -XXXXXXX-
        XXXXXXXXX

 */
public class Triangle1 {
    public static void main(String[] args) {
        int x = 5;
        int a = (x * 2) - 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= a; j++) {
                int b = (1 + ((i - 1) * 2));
                int c = (a - b) / 2;
                System.out.print((j > c && j <= (c + b)) ? "X" : "-");
            }
            System.out.println();
        }
    }
}
