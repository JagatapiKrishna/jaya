package com.tnsif.eleven;
import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> l = new HashSet<String>();

        l.add("rahul");
        l.add("priya");
        l.add("sumit");
        // l.add("sumit");  // Duplicate, won’t be added

        System.out.println(l);

        l.remove("priya");
        System.out.println(l);
    }
}
