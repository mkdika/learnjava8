package com.mkdika.learnjava8.basic.equalhashcode;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Book {
    private int ISBN;

    @Override
    public int hashCode() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN; // can call class private property
                                        // inside the method because of same
                                        // class call.
    }   
    
    public int bookIsbn(Object obj) {
        if (!(obj instanceof Book)) {
            return 0;
        }
        Book other = (Book) obj;
        return other.ISBN; // can call class private property
                           // inside the method because of same
                           // class call.
    }
    
    
}
