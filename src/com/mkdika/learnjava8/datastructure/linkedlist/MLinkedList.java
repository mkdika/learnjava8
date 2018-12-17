package com.mkdika.learnjava8.datastructure.linkedlist;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class MLinkedList {

    public Node head;
    public Node tail;
    public int listCount;

    public MLinkedList() {
        listCount = 0;
    }

    public void show() {
        Node current = head;
        if (current != null) {
            System.out.print("\nContent: [");
            while (current.next != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println(current.data + "]");
            System.out.println("Head: " + head.data);
            System.out.println("Tail: " + tail.data);
            System.out.println("Size: " + listCount + "\n");
        }
    }

    public boolean add(int d) {
        Node end = new Node(d);
        if (listCount == 0) {
            head = end;
            tail = end;
            listCount++;
            System.out.println(d + " appended to head!");
            return true;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = end;
            tail = end;
            listCount++;
            System.out.println(d + " appended to tail!");
            return true;
        }
    }

    public boolean add(int d, int index) {
        Node node = new Node(d);

        if (index > listCount || index < 0) {
            System.out.println("Add Failed: index out of bounds of size of linked list!!");
            return false;
        } else {
            Node current = head;
            if (index == 0) {
                head = node;
                head.next = current;
            } else {
                int jump = 0;
                while (jump < (index - 1) && current != null) {
                    current = current.next;
                    jump++;
                }
                node.next = current.next;
                current.next = node;
                if (node.next == null) {
                    tail = node;
                }
            }
            listCount++;
            System.out.println("Success! " + d + " added at index " + index);
            return true;
        }
    }

//    public boolean deleteNodeWithData(int d) {
//        Node current = head;
//        if (head.data == d) {
//            head = current.next;
//            listCount--;
//            System.out.println("Success! Node with data " + d + " deleted.");
//            return true;
//        } else {
//            while (current.next != null) {
//                if (current.next.data == d) {
//                    current.next = current.next.next;
//                    if (current.next == null) {
//                        tail = current.next;
//                    }
//                    listCount--;
//                    System.out.println("Success! Node with data " + d + " deleted.");
//                    return true;
//                }
//                current = current.next;
//            }
//        }
//        System.out.println("Delete Failed: No node found with given data!");
//        return false;
//    }
//
//    public boolean deleteNodeAtIndex(int index) {
//        Node current = head;
//        int jump;
//        if (index > listCount || index < 1) {
//            System.out.println("Delete Failed: index out of bounds of size of linked list!!");
//            return false;
//        } else {
//            jump = 0;
//            while (jump < index - 1) {
//                current = current.next;
//                jump++;
//            }
//            current.next = current.next.next;
//            System.out.println("Success! Node at index " + index + " deleted.");
//            listCount--;
//            return true;
//        }
//    }
}

class Node {

    Node next;
    int data;

    public Node(int d) {
        next = null;
        data = d;
    }
}
