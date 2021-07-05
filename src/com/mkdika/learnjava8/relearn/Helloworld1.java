package com.mkdika.learnjava8.relearn;

import java.util.ArrayList;
import java.util.List;

public class Helloworld1 {
    public static void main(String[] args) {
        System.out.println("Hello Girl");

        StringBuilder sb = new StringBuilder("first");
        sb.append("second");
        sb.append("third");
        System.out.println(sb);

        List<String> list = new ArrayList<>(3);
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        System.out.println(list);

        String s = "abc";

    }
}
