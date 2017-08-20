package com.mkdika.learnjava8.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Period1 {

    /*  Java 8 Date Time API:
        ---------------------       
        java.time.Period
     */
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015, 10, 13);
        LocalDate date2 = LocalDate.now();
        Period period1 = Period.between(date1, date2);
        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Periode (date1 to date2): " + period1);
        System.out.println("\tYears: " + period1.getYears());
        System.out.println("\tMonths: " + period1.getMonths());
        System.out.println("\tDays: " + period1.getDays());
    }
}
