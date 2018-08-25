package com.mkdika.learnjava8.reflection;

import com.mkdika.learnjava8.reflection.classes.SimpleStack;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class ReflectionDemo {

    public static void main(String[] args) {

        try {
            // new instance class
            // way 1
            Constructor<?> cons1 = SimpleStack.class.getDeclaredConstructor();
            Object stack1 = cons1.newInstance();
            System.out.println("stack1 isNull? " + (stack1 == null));

            // way 2, with constructor arguments
            Class c1 = Class.forName("com.mkdika.learnjava8.reflection.classes.SimpleStack");
            Constructor cons2 = c1.getDeclaredConstructor(int.class);
            Object stack2 = cons2.newInstance(5);
            System.out.println("stack2 isNull? " + (stack2 == null));

            // execute void method
            Class c2 = Class.forName("com.mkdika.learnjava8.reflection.classes.SimpleStack");
            Object stack3 = c2.newInstance();
            Method m1 = c2.getMethod("printInfo");
            m1.invoke(stack3);
            
            // execute return value (non-void) method
            Method m2 = c2.getMethod("isEmpty");
            boolean b1 = (boolean) m2.invoke(stack3);
            System.out.println("stack isEmpty: " + b1);
            
            // change access modified of class field
            Field field1 = c2.getDeclaredField("items");
            field1.setAccessible(true);
            Object stack4 = c2.newInstance();
            System.out.println("Items type: " + field1.getType());
            List<Integer> list = (List<Integer>) field1.get(stack4);
            System.out.println("Items size: " + list.size());
            
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | NoSuchMethodException | SecurityException | 
                ClassNotFoundException | NoSuchFieldException ex) {
            Logger.getLogger(ReflectionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
