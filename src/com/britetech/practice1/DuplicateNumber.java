package com.britetech.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class DuplicateNumber {
 
    public int findDuplicateNumber(List<Integer> numbers){
         
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
       numbers.add(2);
       numbers.add(3);
       numbers.add(1);
       numbers.add(2);
       numbers.add(4);
       numbers.add(5);
       /* for(int i=1;i<201;i++){
        	 
            numbers.add(i);
        }
       
        //add duplicate number into the list
        numbers.add(37);*/
        
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}