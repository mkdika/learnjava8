
package com.mkdika.learnjava8.basic.test.pattern;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class SingletonExample {
    
    private static final TestService instance;
    
    static {
        instance = new TestService();
    }
    
    public static TestService getInstance() {
        return instance;
    }        
}

class TestService {
    public void print() {
        System.out.println("print!!!");
    }
}

class DemoSingleton {
    public static void main(String[] args) {
        SingletonExample.getInstance().print();
    }
}
