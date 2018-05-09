
package com.mkdika.learnjava8.basic.test.pattern;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class FactoryExample {
    
    public static void main(String[] args) {
       
        Food food = foodFactory("spageti");
        food.print();
        
    }
    
    public static Food foodFactory(String food) {
        switch(food) {
            case("pizza"):{
                return new Pizza();
            }
            case("spageti"):{
                return new Spageti();
            }
            default: {
                return new Food();
            }
        }        
    }
    
}

class Food{
    public void print() {
        System.out.println("This is Food");                
    }
}

class Pizza extends Food {

    @Override
    public void print() {
        System.out.println("This is Pizza Food");
    }
    
}

class Spageti extends Food {

    @Override
    public void print() {
        System.out.println("This is Spageti Food");   
    }       
}
