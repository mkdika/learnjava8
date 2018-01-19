package com.mkdika.learnjava8.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class InternationExample {   
    public static void main(String[] args) {
        
        // define each locale lanquaqe object
        Locale us = new Locale("en","US");
        Locale france = new Locale("fr","FR");
        Locale indonesia = new Locale("in","IN");
        
        // the printout properties will follow defined language
        printProperties(us);
        printProperties(france);
        printProperties(indonesia);
    }   
    
    static void printProperties(Locale locale) {
        // read the resource bundle properties file by its location.
        ResourceBundle rb = ResourceBundle.getBundle("com.mkdika.learnjava8.internationalization.Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
        System.out.println();
    }
}
