package com.mkdika.learnjava8.basic.staticimport;

import static com.mkdika.learnjava8.basic.staticimport.Test1.PHI;
import static com.mkdika.learnjava8.basic.staticimport.Test1.printDouble;

public class Test2 {
    public static void main(String[] args) {
        PHI = 2.2;
        printDouble(PHI);
    }    
}
