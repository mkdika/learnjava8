package com.mkdika.learnjava8.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class DateTimeFormatter1 {

    public static void main(String[] args) {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate date = LocalDate.of(2057, 8, 11);
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));
    }
}
