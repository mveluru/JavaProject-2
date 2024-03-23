package com.britetech.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MissingNumber {
    public void firstMissingPositive(int[] nums) {

        int n = nums.length;
        int sumofSeq = (n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            sumofSeq = sumofSeq - nums[i];
        }
        System.out.println(sumofSeq);
    }

    public void firstMissingPositives(int[] nums) {

      int sum = Arrays.stream(nums).sum();
      OptionalInt min = Arrays.stream(nums).min();
      OptionalInt max = Arrays.stream(nums).max();

      int len = nums.length;
      int suma = min.getAsInt();
        int nextnum=0;
        for(int i=0;i<=nums.length;i++){
            if (i!=0) {
                 nextnum= min.getAsInt()+i;
                //System.out.println(nextnum);
            }
            suma = suma+nextnum;

        }
        System.out.println(suma-sum);
    }
    public static void main(String[] args) {
    MissingNumber abcd = new MissingNumber();
    //int[] nums = new int[]{7,8,9,11,12};
        int[] nums = new int[]{10,11,13,14,15};
    abcd.firstMissingPositives(nums);


    }
}
