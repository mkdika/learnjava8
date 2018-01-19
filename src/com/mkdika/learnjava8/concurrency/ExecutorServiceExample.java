package com.mkdika.learnjava8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 
 * Example using Java8 ExecutorService rather than use Thread object.
 */
public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("Begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> {for(int i=0;i<3;i++) System.out.println("Printing record: " + i);});
            service.execute(()-> System.out.println("Printing Zoo Inventory"));
            System.out.println("End");          
        } catch (Exception e) {
            if(service != null) service.shutdown();
        }
    }
    
}
