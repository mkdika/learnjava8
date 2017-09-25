package com.mkdika.learnjava8.functional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class FunctionalFace {

    static Function<Integer, String> intIs;

    public static void main(String args[]) throws IOException {

        // Function
        intIs = i -> new StringBuilder("Integer is: ").append(String.valueOf(i)).toString();
        System.out.println(intIs.apply(121));

        // UnaryOperator
        UnaryOperator<Integer> randInt = x -> (int) (Math.random() * 100);

        // Supplier
        printInt(() -> 78);
        printInt(FunctionalFace::doubleInt);

        // Consumer
        Consumer<Integer> com = x -> System.out.println(intIs.apply(x));
        com.accept(randInt.apply(100));
        com.accept(101);

        // Predicate
        Predicate<Integer> oe = x -> x % 2 == 0;
        oddEvent(randInt.apply(50), oe);
        oddEvent(127, oe);

        // BiConsumer
        HashMap<String, String> hash = new HashMap<>();
        hash.put("cat", "orange");
        hash.put("dog", "black");
        hash.put("snake", "green");
        // Use lambda expression that matches BiConsumer to display HashMap.
        hash.forEach((string1, string2) -> System.out.println(string1 + "..."
                + string2 + ", " + string1.length()));                      
    }

    private static void printInt(Supplier<Integer> args) {
        System.out.println(intIs.apply(args.get()));
    }

    private static int doubleInt() {
        return (int) (Math.random() * 100);
    }

    private static void oddEvent(int n, Predicate<Integer> args) {
        System.out.println(new StringBuilder().append(n).append(" is ").append((args.test(n) ? "Event" : "Odd")).toString());
    }
}
