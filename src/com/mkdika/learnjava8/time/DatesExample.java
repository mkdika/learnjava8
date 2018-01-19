package com.mkdika.learnjava8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class DatesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        System.out.println("Date Now: " + LocalDate.now());  // date only
        System.out.println("Time Now: " + LocalTime.now());  // time only
        System.out.println("DateTime Now: " + LocalDateTime.now());  // date time
        System.out.println("ZonedDateTime Now: " + ZonedDateTime.now());  // date time with timezone info
        
        // get available time zone
        System.out.println("List of Asis Time Zone:");
        ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("Asia"))                
                .sorted().forEach(System.out::println);
        
        
    }
    
}
