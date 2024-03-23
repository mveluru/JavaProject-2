package com.britetech.practice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
       int abc = 123456;
       int reverse =0;
       int count =0;
       while (abc !=0) {
           reverse = reverse * 10 + abc % 10;
           abc = abc / 10;
       }
        System.out.println(reverse);
    }

}
