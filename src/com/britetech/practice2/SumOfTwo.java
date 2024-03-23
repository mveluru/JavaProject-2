package com.britetech.practice2;

import java.util.Arrays;

public class SumOfTwo {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i!=j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
        public static void main (String[] args){
            int[] numArray = {2, 7, 11, 15};
            SumOfTwo st = new SumOfTwo();
            System.out.println(Arrays.toString(st.twoSum(numArray,9)));


    }
}
