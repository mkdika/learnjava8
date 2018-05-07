
package com.mkdika.learnjava8.basic.test.dummy;

import sun.net.util.IPAddressUtil;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public final class Test4 {
    
    class Inner {
        void test() {
            if (Test4.this.flag) {
                sample();
            }
        }
    }
    
    private boolean flag = true;
    public void sample() {
        System.out.println("Sample");
    }
    public Test4() {
        (new Inner()).test();
    }
    public static void main(String[] args) {
        new Test4();
    }
}

class MyRegex  {
    private static String pattern = "^(\\d[0-255])\\.(\\d[0-255])\\.(\\d[0-255])\\.(\\d[0-255])$";
    private String ip;
    
    public MyRegex(String iP) { 
       this.ip = iP;
    }
    
    public boolean isMatch() {
        return sun.net.util.IPAddressUtil.isIPv4LiteralAddress(ip);
//        return ip.matches(pattern);
    }
}
