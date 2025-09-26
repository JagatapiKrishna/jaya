package com.tnsif.eleven;
import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<String>();

        l.addFirst("Hyderabad");
        l.addFirst("Chennai");
        l.addLast("Mumbai");
        l.addLast("Pune");

        String ss = l.getFirst();   // First element
        String sg = l.getLast();    // Last element

        System.out.println("First: " + ss);
        System.out.println("Last: " + sg);

        l.removeFirst(); 
        System.out.println("After removeFirst(): " + l);

        l.removeLast(); 
        System.out.println("After removeLast(): " + l);
    }
}
