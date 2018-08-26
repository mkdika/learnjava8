
package com.mkdika.learnjava8.basic.mixins;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public interface Wireless {
    
    default boolean connectToWifi(String SSID) {
        System.out.println("Connected to WIFI SSID: " + SSID);
        return true;
    }
    
}
