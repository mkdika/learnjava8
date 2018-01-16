package com.mkdika.learnjava8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Stream consist of 3 step:
 * 1. Stream Source
 * 2. Intermediated Operation (Lazy Evaluation)/ Map
 * 3. Terminal Operation / Reduce
 * 
 */
public class StreamExample {
    
    public static void main(String[] args) {
        
        /*
            Few ways to create finite Stream
        */        
        // create empty stream
        Stream<String> empty = Stream.empty();
        System.out.println("count: "+empty.count()); // count = 0
        
        // create stream with single element array
        Stream<Integer> singleElement = Stream.of(1);
        System.out.println("count: "+singleElement.count()); // count = 1
        
        // create stream with array
        Stream<Integer> fromArray = Stream.of(1,2,3);
        System.out.println("count: " + fromArray.count()); // count = 3
        
        // create stream with source of List
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
        System.out.println("count: " + fromList.count());
        
        /*
            few ways to create infinite Stream
        */
        // create random stream elemen
        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        randoms.forEach(System.out::println);        
        
        
        /*
            Common Stream Terminal Operation
            Stream can be performed a terminal operation without any intermediate
            operation but not the other way around.            
        */
        // count
        Stream<String> fruits = Stream.of("Apple","Banana","Cucumber");
        System.out.println("Fruits: " + fruits.count());
        
        // min & max
        Stream<String> monkeys = Stream.of("monkey","ape","bonobo","orangutan");
        Optional<String> minMon = monkeys.min((s1,s2) -> s1.length()-s2.length());
        minMon.ifPresent(System.out::println); // ape
        
        // forEach
        Stream<Double> numbers = Stream.generate(Math::random)
                                        .limit(5)
                                        .map(x -> x*100);
        numbers.forEach(System.out::println);
        
        // collect
        Stream<String> greet = Stream.generate(() -> "Hello")
                                     .limit(10)
                                     .map(s -> s + " World!");
        List<String> cc = greet.collect(Collectors.toList());
        cc.forEach(System.out::println);
        
                                        
        /*
            Common Intermediate Process            
        */
        // filter
        Stream<String> s = Stream.of("monkey","gorilla","bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println); // monkey
        
        // distinct
        Stream<String> sss = Stream.of("duck","duck","duck","goose");
        sss.distinct().forEach(System.out::println); // goose
        
        // sorted
        Stream<String> names = Stream.of("Jack","Andy","Charlie","Bono");
        names.sorted().forEach(System.out::println); // Andy,Bono,Charlie,Jack
        
        /*
            IntStream
        */
        IntStream.rangeClosed(1, 10).forEach(System.out::print);   
        
       
                
        
    }        
}
