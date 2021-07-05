package com.mkdika.learnjava8.algorithms.common;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {

    private static final String FB = "FizzBuzz";
    private static final String F = "Fizz";
    private static final String B = "Buzz";

    private static List<String> check(int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            if (fizz && buzz) {
                result.add(FB);
            } else if (fizz) {
                result.add(F);
            } else if (buzz) {
                result.add(B);
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
