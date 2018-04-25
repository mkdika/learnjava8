
package com.mkdika.learnjava8.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class TextFileIO {
    
    public static void main(String[] args) throws IOException {
        File folder = new File("test");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File inputFile = new File("readme.md");
        char[] chars = new char[(int)inputFile.length()];        
        try(FileReader fr = new FileReader(inputFile)) {            
            fr.read(chars);            
        } catch (IOException ex) {
            Logger.getLogger(TextFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File outputFile = new File("test/baca.txt");
        if (!outputFile.exists()) outputFile.createNewFile();
        try (FileWriter fw = new FileWriter(outputFile)) {
            fw.write(chars);
            fw.flush();
        }catch (IOException ex) {
            Logger.getLogger(TextFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
