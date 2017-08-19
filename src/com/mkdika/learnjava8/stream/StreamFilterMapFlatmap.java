package com.mkdika.learnjava8.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class StreamFilterMapFlatmap {

    private static String[] planets = {"Jupiter", "Venus", "Mercury", "Earth", "Uranus", "Mars",
        "Neptune", "Pluto"};

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("LICENSE")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        System.out.println("Filter word > 10 and Initcap:");
        words.parallelStream()
                .filter(w -> w.length() > 10)                
                .map(String::toLowerCase)
                .map(StreamFilterMapFlatmap::toInitCapitalize) // map is use to transform the stream element                      
                .forEach(System.out::println);
        System.out.println("");

        // limit the stream to top 5
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        System.out.println("");

        // collect stream result as List from array
        List<String> listPlanet = Stream.of(planets)
                .map(String::toLowerCase)
                .filter(w -> w.startsWith("m"))
                .map(StreamFilterMapFlatmap::toInitCapitalize)
                .sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.toList());
        listPlanet.forEach(System.out::println);
        System.out.println("");

        // concat result to string
        String result = Stream.of(planets)
                .map(String::toLowerCase)
                .filter(w -> w.startsWith("m"))
                .map(StreamFilterMapFlatmap::toInitCapitalize)
                .sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.joining(" ")); // separated by whitespace
        System.out.println(result);

    }

    public static String toInitCapitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

}
