package com.mkdika.learnjava8.algorithms.triangles;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Result is like this for x = 5 :
 
    *********
     ******* 
      *****  
       ***   
        *    
       ***   
      *****  
     ******* 
    *********
 
 */
public class Triangle3 {

    public static void main(String[] args) {

        int x = 5; // banyaknya baris yang diinginkan
        int i = ((x * 2) - 1), n = 0;
        while (i > 0) {
            for (int j = 0; j < ((x + (x - 1))); j++) {
                String c = ((j >= n && j < (x + (x - 1) - n)) ? "*" : " ");
                System.out.print(c);
            }
            System.out.println();
            if (i <= x) {
                n--;
            } else {
                n++;
            }
            i--;
        }
    }
}
