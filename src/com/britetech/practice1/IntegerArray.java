package com.britetech.practice1;

import java.util.*;
import java.util.stream.Collectors;

public class IntegerArray {


    public static <ArraysList> void main(String[] args) {

        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 0};


        List<Integer> list = Arrays.stream(ints).boxed().toList();
        Set<Integer> set = new TreeSet<>();
        set = list.stream().collect(Collectors.toSet());
        Iterator<Integer> nameSet = set.iterator();
        //nameSet.forEachRemaining(System.out::println);

        //set.stream().filter(integer -> integer > 5).forEach(integer -> System.out.println(integer));
        List<Integer> ab = new ArrayList<>();
        Random r = new Random();
        int count = 0;
        while (count < 30) {
            ab.add(r.nextInt(1, 10000));
            count++;
        }
        Collections.sort( ab );
        System.out.println(ab);
        Collections.reverse( ab );
        System.out.println(ab);
    }
}
