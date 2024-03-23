package com.britetech.practice2.arrays;

import java.util.*;

public class CommonElementsInTwoArrays {

    public static void main(String[] args) {

        String[] comm1 = {"Murali", "Hello", "Greet", "Abc"};
        String[] Comm2 = {"Murali", "KT", "Vamsi"};

        List<String> com1List = new ArrayList<>();
        List<String> com2List = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (String s : comm1) {
            com1List.add(s);
            set.add(s);
        }
        for (String s : Comm2) {
            com2List.add(s);
            set.add(s);

        }

        com1List.retainAll(com2List);
        //com1List.stream().forEach(s -> System.out.println(s));
        // Remove common element

        set.stream().forEach(s -> System.out.println(s));

    }
}
