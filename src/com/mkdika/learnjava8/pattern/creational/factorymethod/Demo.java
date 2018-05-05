
package com.mkdika.learnjava8.pattern.creational.factorymethod;

import com.mkdika.learnjava8.pattern.creational.factorymethod.factory.Dialog;
import com.mkdika.learnjava8.pattern.creational.factorymethod.factory.HtmlDialog;
import com.mkdika.learnjava8.pattern.creational.factorymethod.factory.WindowsDialog;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Demo {
    
    private static Dialog dialog;
    
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    
    static void runBusinessLogic() {
        dialog.renderWindow();
    }    
}
