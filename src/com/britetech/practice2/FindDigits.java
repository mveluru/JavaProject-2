package com.britetech.practice2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDigits {

    public static void main(String[] args) {
        String inputString = " Murali1234567";
        String digits = "[0123456789]";
        Pattern p = Pattern.compile(digits);
        String string = inputString.trim();
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println(count);

    }
}
