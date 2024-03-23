package com.britetech.practice2;

import java.util.Arrays;

public class Anagaram {

    public static boolean isAnagaram(String a1,String a2){
        char[] char1 = a1.toCharArray();
        char[] char2 = a2.toCharArray();
        Arrays.parallelSort(char1);
        Arrays.parallelSort(char2);
        int count=0;
        if (char1.length == char2.length){
            for(int i=0;i<char1.length;i++){
               if (char1[i] == char2[i]){
                    count++;
                }
            }//end of for loop
        }
        if ((count== char1.length)&& (count== char2.length)){
            return true;
        }else{
            return false;
        }

    }


    public static void main(String[] args) {
        String s1 = "cinema";
        String s2 = "iceman";
        System.out.println(Anagaram.isAnagaram(s1,s2));
    }
}
