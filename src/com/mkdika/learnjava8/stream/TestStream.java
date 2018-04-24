package com.mkdika.learnjava8.stream;

import static java.util.Comparator.comparing;
import java.util.stream.Stream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestStream {

    public static void main(String[] args) {

        Stream<String> fruits = Stream.of("papaya", "banana", "apple", "grape", "coconut");
        fruits.sorted().forEach(System.out::println); // auto sort
        
        System.out.println();
        Stream<Person> persons = Stream.of(new Person("Michael",20),new Person("Andy",17),
                                           new Person("Antony",10),new Person("Megan",9));
        persons.sorted(comparing(Person::getName)
                .thenComparing(Person::getAge)).forEach(System.out::println);                
    }
}

class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
      
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
                           
    @Override
    public String toString() {
        return this.name+" ("+this.age+")";
    }        
}
