package com.mkdika.learnjava8.algorithms.triangles;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 
        1    
       123   
      12345  
     1234567 
    123456789
     1234567 
      12345  
       123   
        1   
 
 */
public class Triangle2 {

    public static void main(String[] args) {

        int x = 9; // harus ganjil (1-9)

        int y = ((x - 1) / 2);
        int i = 1;
        int n = 1;
        while (i <= x) {
            int b = 1;
            for (int j = 1; j <= x; j++) {
                int d = (1 + ((n - 1) * 2));
                int e = (x - d) / 2;
                if (j > e && j <= (d + e)) {
                    System.out.print(b);
                    b++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if (i <= y) {
                n++;
            } else {
                n--;
            }
            i++;
        }
    }
}
