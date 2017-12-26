package com.mkdika.learnjava8.basic.innerclass;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class AnonymousInnerClass {

    abstract class SaleTodayOnly {

        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

}
