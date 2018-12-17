/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdika.learnjava8.basic.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class Test2 {
    
    public static void main(String[] args) {
//       
//        Lambor aventador = new Lambor();
//        aventador.startMachine();
//        aventador.startTurbo();
//        aventador.expensive();
//        aventador.xxx();

            
        RaceCar racecar = new RaceCar() {
            @Override
            public void startTurbo() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void xxx() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
       
                
    }
    
}

class Lambor  extends ExoticCar implements RaceCar{
    
    void startMachine() {
        System.out.println("machine start");
    }

    @Override
    void cosumeFeul() {
    }

    @Override
    public void startTurbo() {
    }

    
    
}

interface RaceCar {
    
    void startTurbo();
    
     public void xxx() ;
    
}

abstract class ExoticCar {
    
    int doors = 2;
    
    void expensive() {
        System.out.println("VERY EXPENSIVE!!");
    }
    
    abstract void cosumeFeul();
    
}
