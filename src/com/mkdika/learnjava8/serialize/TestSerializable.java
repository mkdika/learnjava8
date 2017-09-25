package com.mkdika.learnjava8.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TestSerializable {

    public static void main(String[] args) {

        Customer c = new Customer("maikel", "chandika");
        c.setShowName("Maikel Chan");
        System.out.println(c.toString());

        try (ObjectOutputStream oos
                = new ObjectOutputStream(new FileOutputStream("/home/maikel/customer.obj"))) {
            oos.writeObject(c);
            System.out.println("Done");
        } catch (Exception ex) {
        }
    }
}
