package com.mkdika.learnjava8.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class HigherOrderFunction {

    public static void main(String[] args) {
        // higher order function. function as parameter, return value
        Function<Integer, String> fun = x -> String.valueOf("hof value=" + x);
        BiFunction<Function<Integer, String>, Integer, String> hof = (v, i) -> v.apply(i);
        System.out.println(hof.apply(fun, 666));
        // Result: hof value=666

        
        // currying. Because Java does not support currying out of box.
        // function return function
        Converter converter = new Converter();
        Function<Double, Double> usdIdr = converter.curry2(13500d);
        System.out.println("USD 2 = IRD " + usdIdr.apply(2d));
        // Result: USD 2 = IRD 27000.0
        System.out.println("USD 5 = IRD " + usdIdr.apply(5d));
        // Result: USD 5 = IRD 67500.0
        
        Function<Double, Double> usd = converter.curry1(2d);
        System.out.println("Rate IDR 13.500 for USD 2 = " + usd.apply(13500d));
        // Result: Rate IDR 13.500 for USD 2 = 27000.0
        System.out.println("Rate IDR 13.320 for USD 2 = " + usd.apply(13320d));
        // Result: Rate IDR 13.320 for USD 2 = 26640.0

        
        // function composition
        Function<Integer, Integer> times2 = e -> e * 2;
        Function<Integer, Integer> squared = e -> e * e;
        System.out.println("compose1 = "+times2.compose(squared).apply(4));
        // Result: 32
        System.out.println("compose2 = "+times2.andThen(squared).apply(4));
        // Result: 64
    }
}

// build extended interface from exisiting on
@FunctionalInterface
interface ExBiFunction<T, U, R> extends BiFunction<T, U, R> {

    default Function<T, R> curry1(U u) {
        return t -> apply(t, u);
    }

    default Function<U, R> curry2(T t) {
        return u -> apply(t, u);
    }
}

class Converter implements ExBiFunction<Double, Double, Double> {

    @Override
    public Double apply(Double conversionRate, Double value) {
        return conversionRate * value;
    }
}