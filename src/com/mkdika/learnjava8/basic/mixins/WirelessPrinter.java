
package com.mkdika.learnjava8.basic.mixins;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class WirelessPrinter implements Printer,Wireless{

    private String connectedSSID;

    public WirelessPrinter(String connectedSSID) {
        this.connectedSSID = connectedSSID;
        connectToWifi(connectedSSID);
    }
    
    public static void main(String[] args) {
        WirelessPrinter wifiPrinter = new WirelessPrinter("MyWiFi");
        wifiPrinter.printInfo();
    }
}


