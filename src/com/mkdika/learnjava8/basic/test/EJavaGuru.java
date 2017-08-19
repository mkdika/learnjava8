package com.mkdika.learnjava8.basic.test;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
class EJavaGuru {

    public static void main(String args[]) {
        Course course = new Course();
        char c = 'x';        
        course.enroll(c);
        course.enroll("Object");
        course.enroll(new Object());
    }

}
