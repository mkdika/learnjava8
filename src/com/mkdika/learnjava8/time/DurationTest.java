package com.mkdika.learnjava8.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class DurationTest {

    /*  Java 8 Date Time API:
        ---------------------       
        java.time.Duration
     */
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.of(2018, 5, 15, 10, 16, 45);
        LocalDateTime time2 = LocalDateTime.now();
        Duration duration = Duration.between(time1, time2);
        System.out.println("Date1: " + time1);
        System.out.println("Date2: " + time2);
        System.out.println("Periode (date1 to date2): " + duration);
        System.out.println("\tDays   : " + duration.toDays());
        System.out.println("\tHours  : " + duration.toHours());
        System.out.println("\tMinutes: " + duration.toMinutes());
        System.out.println("\tseconds: " + duration.toMillis()/1000);

    }
}
