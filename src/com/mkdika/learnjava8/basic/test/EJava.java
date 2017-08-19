/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdika.learnjava8.basic.test;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class EJava {

    public EJava() {
        this(7);
        System.out.println("public");
    }

    private EJava(int val) {
        this("Sunday");
        System.out.println("private");
    }

    protected EJava(String val) {
        System.out.println("protected");
    }
    
    EJava(double val) {
        System.out.println("default");
    }

}
