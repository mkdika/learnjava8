package com.mkdika.learnjava8.basic.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class DuckComparator {
    
    private String name;
    private int weight;

    public DuckComparator(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " ("+weight+")";
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public static void main(String[] args) {
        
        List<DuckComparator> dc = new ArrayList<>();
        dc.add(new DuckComparator("Doo", 2));
        dc.add(new DuckComparator("Aoo", 4));
        dc.add(new DuckComparator("Boo", 1));
        System.out.println(dc);
        
        // create anonymous implementaion of Comparator (lambda) 
        // for Collections.sort by weight
        Collections.sort(dc, (d1,d2) -> d1.getWeight() - d2.getWeight());
        System.out.println(dc);        
        
        // sort by name
        Collections.sort(dc, (d1,d2) -> d1.getName().compareTo(d2.getName()));
        System.out.println(dc);
        
        // remove if
        dc.removeIf(d -> d.getName().startsWith("B"));
        System.out.println(dc);
    }
}
