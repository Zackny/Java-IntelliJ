package com.syntsx.class27;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that

         */

        ArrayList<String>names=new ArrayList<>();
        names.add("Zack");
        names.add("Mark");
        names.add("Peter");
        names.add("Stefan");
        names.add("Dusan");
        System.out.println( names.isEmpty());
        System.out.println( names.contains("Zack"));
        System.out.println( names.size());
        System.out.println(names);
        for (String n:names
             ) {
            System.out.println(n);
        }

    }
}
