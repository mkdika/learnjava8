package com.mkdika.learnjava8.basic.innerclass;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 * 3 Level inner class demo, cringe class >_<
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.allTheX();
    }
}

class A {
    
    private int x = 10;
    class B {
        // static String test = "test"; // error,inner class can not have static
        private int x = 20;
        class C {
            private int x = 30;            
            public void allTheX() {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(B.this.x);
                System.out.println(A.this.x);
            }
        }
    }
}
