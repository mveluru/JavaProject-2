package com.britetech.practice2;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] array){

        for(int i=0;i<array.length;i++){
            boolean isSorted =true;
            for(int j=1;j<array.length;j++){
                if (array[j]<array[j-1]){
                    array[j-1]=array[j-1]^array[j]^(array[j]=array[j-1]);
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] toSort={23,3,4,50,2,100};
        bubbleSort.sort(toSort);
    }
}
