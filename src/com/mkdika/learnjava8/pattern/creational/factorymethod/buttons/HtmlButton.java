
package com.mkdika.learnjava8.pattern.creational.factorymethod.buttons;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

}
