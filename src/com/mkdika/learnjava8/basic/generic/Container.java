package com.mkdika.learnjava8.basic.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Container<T> {
    
    private final List<T> contents;
    
    Container() {
        this.contents = new ArrayList<>();
    }
    
    public T getFirst() {
        if (contents != null && contents.size() > 0 ) {
            return contents.get(0);
        }else {
            return null;
        }        
    }
    
    // example for method generic, with different formal generic notation
    public <U> U calculate(T t, U u) {
        return u;
    }
}
