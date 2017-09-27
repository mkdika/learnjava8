package com.mkdika.learnjava8.algorithms.linkedlist;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class MLinkedListUsage {

    public static void main(String[] args) {

        MLinkedList list = new MLinkedList();
        list.show();
        list.add(3);
        list.show();
        list.add(2);
        list.show();
        list.add(5);
        list.add(8);
        list.add(6);
        list.show();
        list.add(4, 2);
        list.show();
        list.add(0, 0);
        list.show();
        list.add(9, 6);
        list.show();
        list.add(7, 8);
        list.show();
        list.add(1);
        list.show();

//        list.deleteNodeWithData(9);
//        list.show();
//        list.deleteNodeWithData(0);
//        list.show();
//        list.deleteNodeWithData(1);
//        list.show();
    }
}
