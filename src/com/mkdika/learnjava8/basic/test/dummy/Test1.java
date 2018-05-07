package com.mkdika.learnjava8.basic.test.dummy;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Test1 {

    public static void main(String[] args) {
        String input = "He is a very very good boy, isn't he?";
        String[] x = input.split("\\!|\\,|\\?|\\.|\\_|\\'|\\@|\\s+");
        int n = (int) Stream.of(x).filter(s -> {
            return !s.isEmpty();        
        }).count();
        
        System.out.println(n);                                
        Stream.of(x).forEach(s -> {
            if (!s.isEmpty()) {
                System.out.println(s);
            }
        });
    }

   public static String getDay(String day, String month, String year) {
        
        LocalDate ld = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        return ld.getDayOfWeek().toString();
        
    }
    
}
class MyCalculator {

        int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }

            return (p == 0) ? 1 : n * power(n, p - 1);
        }
    }
