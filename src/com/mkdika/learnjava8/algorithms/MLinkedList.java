package com.mkdika.learnjava8.algorithms;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class MLinkedList<E> {

    private MLinkedList link;
    private E value;

    public MLinkedList() {

    }

    public MLinkedList(MLinkedList link, E value) {
        this.link = link;
        this.value = value;
    }

    public MLinkedList getLink() {
        return link;
    }

    public void setLink(MLinkedList link) {
        this.link = link;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

}
