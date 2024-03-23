package com.britetech.practice2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSimilarWords {

    public static void main(String[] args) {
        String value ="Hello Hello Guru Guru Murali Murali Hello Hello Guru Guru Murali Murali";
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(value);
        int count =0;
         while (m.find()){
             count++;
         }
        System.out.println(count+1);
         // otherway
        int charcount=0;
        char[] chars = value.toCharArray();
        for(char c: chars){
            if (Character.isWhitespace(c)){
                charcount++;
            }
        }
        System.out.println(charcount+1);
    }

}
