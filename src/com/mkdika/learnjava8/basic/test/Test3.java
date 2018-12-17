/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdika.learnjava8.basic.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class Test3 {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.hashCode();
        bird.equals(bird);
        List<String> list = new ArrayList<>();

    }
}

class Bird {

    @Override
    public int hashCode() {
        System.out.println("called overided hashcode.");
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("called overided equals");
        return true;
    }

}
