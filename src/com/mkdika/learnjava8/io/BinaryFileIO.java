package com.mkdika.learnjava8.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class BinaryFileIO {

    public static void main(String[] args) throws IOException  {

        File folder = new File("test");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File inputFile = new File("customer.obj");
        byte[] bytes = new byte[(int)inputFile.length()];
        try (FileInputStream is = new FileInputStream(inputFile)) {
            System.out.println(is.available() + " bytes");
            System.out.println("Length: " + inputFile.length());            
            System.out.println("Before:\n"+Arrays.toString(bytes));            
            is.read(bytes);            
            System.out.println("After:\n"+Arrays.toString(bytes));                                   
        } catch (IOException ex) {
            Logger.getLogger(BinaryFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File outputFile = new File("test/xyz.obj");
        if (!outputFile.exists()) outputFile.createNewFile();
        try (FileOutputStream os = new FileOutputStream(outputFile)) {
            os.write(bytes);  
            os.flush();
            System.out.println("File written!");
        } catch (IOException ex) {
            Logger.getLogger(BinaryFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
