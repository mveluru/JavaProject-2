package com.britetech.practice2.arrays;

public class VerifyallCharsareSame {

    static boolean allCharsSameVerification(String s) {
        boolean verified = false;

        System.out.println(s);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(0)) {
                verified = true;
            } else {
                verified = false;
            }
        }
        return verified;
    }


    public static void main(String[] args) {
        String s = "aaaaA";
        System.out.println(allCharsSameVerification(s));

    }


}
