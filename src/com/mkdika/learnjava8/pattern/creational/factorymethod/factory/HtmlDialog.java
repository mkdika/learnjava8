
package com.mkdika.learnjava8.pattern.creational.factorymethod.factory;

import com.mkdika.learnjava8.pattern.creational.factorymethod.buttons.Button;
import com.mkdika.learnjava8.pattern.creational.factorymethod.buttons.HtmlButton;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
