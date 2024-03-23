package com.britetech.practice2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseWords {
    public static void main(String[] args) {
        String abc = "geeks quiz practice code geeks quiz practice code";
        String regex = "\s";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(abc);
        int count = 0;
        while (matcher.find()) {
            count++;

        }
        System.out.println(count);

        String[] abcd = abc.split(regex);
        for (int i = abcd.length - 1; i >= 0; i--) {
            System.out.print(abcd[i] + " ");
        }
    }

}

