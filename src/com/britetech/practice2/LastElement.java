package com.britetech.practice2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LastElement {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] dupsarray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.stream(array).boxed().skip(array.length-2).findFirst().get());
        System.out.println(Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).toList());
        System.out.println(Arrays.stream(array).average().getAsDouble());
        Arrays.stream(array).filter(i->i%2!=0).forEach(System.out::println);

        String[] abc = {"Murali","dhar","Veluru"};
        System.out.println(Arrays.stream(abc).map(w->new StringBuffer(w).reverse()).collect(Collectors.toSet()));
        Set eset = new HashSet();
        int abcd = 123456789;
        int finalnum=0;

         while (abcd != 0){
              finalnum = finalnum * 10 + abcd % 10;
              abcd = abcd / 10;
         }
        System.out.println(finalnum);




    }
}
