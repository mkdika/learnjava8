package com.mkdika.learnjava8.basic.test.pattern;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public final class SingletonExampleLazy {

    private static TestService instance;
    
    private SingletonExampleLazy() {
        
    }

    public static TestService getInstance() {
        if (instance == null) {
            instance = new TestService();
        }
        return instance;
    }
}

class DemoSingletonLazy {

    public static void main(String[] args) {
        
       
        
        
        SingletonExampleLazy.getInstance().print();
    }
}
