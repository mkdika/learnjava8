package com.mkdika.learnjava8.basic.tryresources;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TryResourceExample {
    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            System.out.println("put turkeys in");
        } 
        // catch are optional, but need to be handled if the close method
        // throw checked exception.
        catch (IllegalStateException e) { 
            System.out.println("caught: " + e.getMessage());
        }
    }
}

// implement java.lang.AutoCloseable allow class to process
// by Try-Catch-Resources (Java Automatic Resources Management)
class JammedTurkeyCage implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }
}
