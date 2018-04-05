package com.mkdika.learnjava8.algorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class RenamePhoto {

    private SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String renameProcess(String S) {
        String[] lines = S.split("[\\r\\n]+");

        List<Photo> list = Stream.of(lines)
                .map((Object x) -> {
                    String[] ss = x.toString().split(",");
                    Photo p = null;
                    try {
                        p = new Photo(ss[0], ss[0].split("\\.")[1], ss[1].trim(), f.parse(ss[2].trim()));
                    } catch (ParseException ex) {

                    }
                    return p;
                }).collect(Collectors.toList());

        Map<String, Long> cityCount = (Map<String, Long>) list.stream().collect(Collectors
                .groupingBy(Photo::getCity, Collectors.counting()));

        Map<String, Integer> count = cityCount.keySet().stream().collect(Collectors.toMap(Function.identity(), i -> 1));

        Map<String, Integer> sorted = list.stream().sorted(Comparator.comparing(Photo::getCity).thenComparing(Photo::getTime))
                .collect(Collectors.toMap((p) -> {
                    return (p.getCity() + String.valueOf(p.hashCode()));
                }, p -> {
                    int c = count.get(p.getCity());
                    count.put(p.getCity(), c + 1);
                    return c;
                }));

        return list.stream().map(p -> {
            String c = lpad(sorted.get(p.getCity() + String.valueOf(p.hashCode())).toString(), String.valueOf(cityCount.get(p.getCity()).intValue()).length(), "0");
            return new StringBuilder(p.getCity()).append(c).append(".").append(p.getExt()).toString();
        }).collect(Collectors.joining("\n"));
    }

    private String lpad(String v, int len, String pchar) {
        StringBuilder slpad = new StringBuilder();
        for (int i = v.length() + 1; i <= len; i++) {
            slpad.append(pchar);
        }
        return slpad.append(v).toString();
    }

    public static void main(String[] args) {

        RenamePhoto p = new RenamePhoto();

        String input = "photo.jpg, Warsaw, 2013-09-05 14:08:15\n"
                + "john.png, London, 2015-06-20 15:13:22\n"
                + "myFriends.png, Warsaw, 2013-09-05 14:07:13\n"
                + "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n"
                + "pisatower.jpg, Paris, 2015-07-22 23:59:59\n"
                + "BOB.jpg, London, 2015-08-05 00:02:03\n"
                + "notredame.png, Paris, 2015-09-01 12:00:00\n"
                + "me.jpg, Warsaw, 2013-09-06 15:40:22\n"
                + "a.png, Warsaw, 2016-02-13 13:33:50\n"
                + "b.jpg, Warsaw, 2016-01-02 15:12:22\n"
                + "c.jpg, Warsaw, 2016-01-02 14:34:30\n"
                + "d.jpg, Warsaw, 2016-01-02 15:15:01\n"
                + "e.png, Warsaw, 2016-01-02 09:49:09\n"
                + "f.png, Warsaw, 2016-01-02 10:55:32\n"
                + "g.jpg, Warsaw, 2016-02-29 22:13:11";

        String expectedResult = "Warsaw02.jpg\n"
                + "London1.png\n"
                + "Warsaw01.png\n"
                + "Paris2.jpg\n"
                + "Paris1.jpg\n"
                + "London2.jpg\n"
                + "Paris3.png\n"
                + "Warsaw03.jpg\n"
                + "Warsaw09.png\n"
                + "Warsaw07.jpg\n"
                + "Warsaw06.jpg\n"
                + "Warsaw08.jpg\n"
                + "Warsaw04.png\n"
                + "Warsaw05.png\n"
                + "Warsaw10.jpg";
        
        String result = p.renameProcess(input);
        System.out.println("Result:\n\n"+result);
        System.out.println();
        System.out.println("Result is"+(expectedResult.equals(result)?" expected!":" not expected!" ));
    }
}

class Photo {

    String name;
    String ext;
    String city;
    Date time;

    public Photo(String name, String ext, String city, Date time) {
        this.name = name;
        this.ext = ext;
        this.city = city;
        this.time = time;
    }

    public String getExt() {
        return ext;
    }

    public String getCity() {
        return city;
    }

    public Date getTime() {
        return time;
    }
}
