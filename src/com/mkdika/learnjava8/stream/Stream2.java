package com.mkdika.learnjava8.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Stream2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("LICENSE")),StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));        
        System.out.println("total words: " + words.size());        
        System.out.println("");
        
        // with regular stream
        long d1 = System.currentTimeMillis();
        long count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println("count words > 12: "+count);        
        words.stream().filter(w -> w.length() > 12).forEach(System.out::println);
        long d2 = System.currentTimeMillis();
        System.out.println("process time: " + (d2 - d1)+" msecs");
        System.out.println("");
        
        // with pararel stream
        long d3 = System.currentTimeMillis();
        long count2 = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println("count words > 12: "+count2);        
        words.parallelStream().filter(w -> w.length() > 12).forEach(System.out::println);
        long d4 = System.currentTimeMillis();
        System.out.println("process time: " + (d4 - d3)+" msecs");
    }    
}
