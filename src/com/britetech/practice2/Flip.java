package com.britetech.practice2;

import java.util.Arrays;

public class Flip {
    public static void main(String[] args) {
        int[] abc = new int[]{10, 11, 12, 13, 14, 15, 16,17,18,19,20,21,22};
        for (int i=0;i<abc.length-1;i++){
            if (i % 2 != 0) {
                abc[i] = abc[i] ^ abc[i + 1] ^ (abc[i + 1] = abc[i]);
            }

        }
        System.out.println(Arrays.toString(abc));
    }
}
