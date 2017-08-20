package com.mkdika.learnjava8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class DateTime1 {

    /*  Java 8 Date Time API:
        ---------------------
        java.time.LocalDate
        java.time.LocalTime
        java.time.LocalDateTime        
     */
    public static void main(String[] args) {
        System.out.println("LocalDate:");
        LocalDate date1 = LocalDate.of(2017, 8, 17); // 18 Aug 2017
        LocalDate date2 = LocalDate.of(2017, Month.DECEMBER, 25); // 25 Dec 2017
        LocalDate date3 = LocalDate.now();
        LocalDate date4 = LocalDate.parse("2015-10-13");
        
        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Is date1 before date2? " + (date1.isBefore(date2)));
        System.out.println("Date3 (current date): " + date3);
        System.out.println("Date3 - The day after tommorow: " + date3.plusDays(2));
        System.out.println("Date4: " + date4);        
        System.out.println("\tDay of Month: " + date4.getDayOfMonth());
        System.out.println("\tDay of Week: " + date4.getDayOfWeek());
        System.out.println("\tDay of Year: " + date4.getDayOfYear());
        System.out.println("\tMonth: " + date4.getMonth());
        System.out.println("\tMonth Value: " + date4.getMonthValue());
        System.out.println("\tYear: " + date4.getYear());
        System.out.println("\tAdd Time: " + date4.atTime(5, 55, 55));
        
        System.out.println("\nLocalTime:");
        LocalTime time1 = LocalTime.of(17, 45, 10);
        System.out.println("Time1: " + time1);
        System.out.println("\tHour: "+time1.getHour());
        System.out.println("\tMinute: "+time1.getMinute());
        System.out.println("\tSecond: "+time1.getSecond());
        
        System.out.println("\nLocalDateTime:");
        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println("Datetime1: "+ datetime1);
        System.out.println("\tDay of Month: " + datetime1.getDayOfMonth());
        System.out.println("\tDay of Week: " + datetime1.getDayOfWeek());
        System.out.println("\tDay of Year: " + datetime1.getDayOfYear());
        System.out.println("\tMonth: " + datetime1.getMonth());
        System.out.println("\tMonth Value: " + datetime1.getMonthValue());
        System.out.println("\tYear: " + datetime1.getYear());        
        System.out.println("\tHour: "+datetime1.getHour());
        System.out.println("\tMinute: "+datetime1.getMinute());
        System.out.println("\tSecond: "+datetime1.getSecond());                        
    }
}
