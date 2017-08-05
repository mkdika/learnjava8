package com.mkdika.learnjava8.lambda;

import java.util.Arrays;
import javafx.scene.control.Button;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class MethodReference {
    
    private static String[] planets = {"Jupiter","Venus","Mercury","Earth","Uranus","Mars",
                           "Neptune","Pluto"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // with lambda expression
        Button b = new Button();
        b.setOnAction(e -> System.out.println(e));
        
        // with method reference
        b.setOnAction(System.out::println);              
    }

}
