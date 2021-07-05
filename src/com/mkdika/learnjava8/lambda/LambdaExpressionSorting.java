package com.mkdika.learnjava8.lambda;

import java.util.Arrays;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class LambdaExpressionSorting {

    private static String[] planets = {"Jupiter", "Venus", "Mercury", "Earth", "Uranus", "Mars",
        "Neptune", "Pluto"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sort by Word length:");
        Arrays.sort(planets, (String a, String b) ->
            Integer.compare(a.length(), b.length()) 
                    );
        for (String s : planets) {
            System.out.println(s);
        }

        // sort & print with method reference
        System.out.println("\nSort and print with Method Reference:");
        Arrays.sort(planets, String::compareToIgnoreCase);
        Arrays.asList(planets).forEach(System.out::println);
    }

}
