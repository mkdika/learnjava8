package com.mkdika.learnjava8.serialize;

import java.io.Serializable;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Customer implements Serializable  {
    
    private static final long serialVersionUID = 1L;
    
    private String firstName;
    private String lastName;
    
    private transient String showName;
    
    public Customer() {
        
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }   

    @Override
    public String toString() {
        return "[firstName="+firstName+", lastName="+lastName+", showName="+showName+"]";
    }        
}
