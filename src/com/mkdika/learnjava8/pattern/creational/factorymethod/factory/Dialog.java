
package com.mkdika.learnjava8.pattern.creational.factorymethod.factory;

import com.mkdika.learnjava8.pattern.creational.factorymethod.buttons.Button;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public abstract class Dialog {
    public void renderWindow() {      
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific
     * button objects.
     * @return 
     */
    public abstract Button createButton();
}
