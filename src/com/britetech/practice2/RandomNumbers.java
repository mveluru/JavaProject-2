package com.britetech.practice2;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        for (int i=0;i<10;i++) {
            System.out.print(randomNumber.nextInt(1, 50)+" ");
        }

    }
}
