package com.mkdika.learnjava8.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserializable {

    public static void main(String[] args) {

        try (ObjectInputStream ois
                = new ObjectInputStream(new FileInputStream("/home/maikel/customer.obj"))) {

            Customer c = (Customer) ois.readObject();
            System.out.println(c.toString());

        } catch (Exception ex) {
        }

    }
}
