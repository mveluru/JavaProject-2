package com.britetech.practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinNumber {
    public static void main(String[] args) {
        int[] array = new int[]{2,22,10,4,5,10,11,12};
        List<Integer> abc = Arrays.stream(array).sorted().boxed().toList();
        System.out.println(abc);
        List<Integer> abcd = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).toList();
        System.out.println(abcd);

    }
}
