package com.mkdika.learnjava8.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Datatype {

    // integer declaration
    int baseDecimal = 287;      // base decimal
    int octVal = 0413;          // octal number system
    int hexVal = 0x10c;         // hexadecimal number system    
    int binVal = 0b10001011;    // binary number system
    int financialValue = 25_375_000;

    // floating number declaration
    float average = 20.129f;
    double inclination = 120.1743;
    double inclination2 = 120.1743d;

    public static void main(String[] args) {
        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;
        System.out.println(baseDecimal + octVal);
        System.out.println(hexVal + binVal);

        double inclination3 = 120.174e3d;
        System.out.println(inclination3);

        char c1 = 122;
        System.out.println(c1);

        char c2 = '\u0122'; // unicode
        System.out.println(c2);

        char $c3 = 'r';
        char _c4 = 'x';

        System.out.println($c3 + _c4);

        int a = 5;
        int b = 3;
        a += b;
        System.out.println(a);

        long c = a;

        boolean b1, b2, b3, b4;
        b1 = b2 = b3 = true;

        ++a;
        System.out.println(a);

        int x = 10;
        x = x++ + x + x-- - x-- + ++x;
        System.out.println(x);
        
        List<Double> list = new ArrayList<>();
        
        

    }

}
