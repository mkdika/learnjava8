package com.mkdika.learnjava8.basic.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class DuckComparable implements Comparable<DuckComparable> {

    private String name;

    public DuckComparable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // add a new business process wo the class are ready to use in comparison
    // process (ex: sort).
    @Override
    public int compareTo(DuckComparable d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        List<DuckComparable> ducks = new ArrayList<>();
        ducks.add(new DuckComparable("Quack"));
        ducks.add(new DuckComparable("Arrgh"));
        ducks.add(new DuckComparable("Puddles"));
        System.out.println(ducks);
        Collections.sort(ducks);  
    }
}
