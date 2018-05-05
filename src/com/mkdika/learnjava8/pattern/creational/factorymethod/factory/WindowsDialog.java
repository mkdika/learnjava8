
package com.mkdika.learnjava8.pattern.creational.factorymethod.factory;

import com.mkdika.learnjava8.pattern.creational.factorymethod.buttons.Button;
import com.mkdika.learnjava8.pattern.creational.factorymethod.buttons.WindowsButton;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }    
}
