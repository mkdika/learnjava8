package com.mkdika.learnjava8.basic;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * This class is to demo the different from pass by value and pass by reference.
 */
public class PassByValueReferences {
    
    static final Customer finalCust = new Customer("Maikel");

    public static void main(String[] args) {

        /*
            Pass By Value:
            variable n is going to pass as argument for CalPassByValue method,
            after the method called, the value remain same, because
            the value is the one that pass not the object/variable.
         */
        int n = 5;
        System.out.println(n);
        calPassByValue(n);
        System.out.println(n);
        
        
        /*
            Pass by Reference:
            object customer with name as property. After the method called,
            name property in object customer is changed.
        */
        Customer customer = new Customer("Jim");
        System.out.println(customer.getName());
        calPassByReference(customer);
        System.out.println(customer.getName());
        
        
        /*
            Final keyword trick:
            The Final keyword function is to protect the object references,
            not the value. That why we can change the property name with 
            setter event the object are final.
        */
        System.out.println(finalCust.getName());
        finalCust.setName("Budiman");
        System.out.println(finalCust.getName());      
    }

    public static void calPassByValue(int n) {
        n = n * 100;
    }
    
    public static void calPassByReference(Customer c) {
        c.setName("John");
    }

}

class Customer {

    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
