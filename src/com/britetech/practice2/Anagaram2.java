package com.britetech.practice2;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Anagaram2 {

    private boolean checkAnagaram(String s1, String s2) {
        boolean isAnagram = false;
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        Arrays.sort(s1Char);
        Arrays.sort(s2Char);
        int count = 0;
        if (s1Char.length != s2Char.length) {
            return false;
        }
        while (count < s1Char.length) {
            isAnagram = (s1Char[count] == s2Char[count]) ? true : false;
            count++;
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        Anagaram2 a = new Anagaram2();
        System.out.println(a.checkAnagaram(s1, s2));

    }
}
