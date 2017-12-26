package com.mkdika.learnjava8.time;

import java.util.ArrayList;
import java.util.List;

public class TestDateTime {

    public static void main(String[] args) {

        ArrayList<Integer> myArrList = new ArrayList<>();
        Integer one = 1;
        Integer two = new Integer(2);
        myArrList.add(one);
        myArrList.add(two);
        ArrayList<Integer> yourArrList = myArrList;
        
        Integer x = myArrList.get(0);
        x = 11;
        
        myArrList.add(1, 66);
        
        myArrList.add(4, 77);
        
        for (Integer val : myArrList) {
            System.out.print(val + ":");
        }
        for (Integer val : yourArrList) {
            System.out.print(val + ":");
        }

    }

}
