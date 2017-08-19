package com.mkdika.learnjava8.basic.test;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class StringEqual {
    public static void main(String[] args) {
        String s1 = "maikel";
        String s2 = "maikel";
        String s3 = "chandika";
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s2 == s3 : " + (s2 == s3));
        s3 = "maikel";
        System.out.println("s3 = \"maikel\"");
        System.out.println("s2 == s3 : " + (s2 == s3));        
        s3 = new String("maikel");
        System.out.println("s3 = new String(\"maikel\");");
        System.out.println("s2 == s3 : " + (s2 == s3));
        s3 = s2;
        System.out.println("s3 = s2");
        System.out.println("s2 == s3 : " + (s2 == s3));
        
    }    
}
