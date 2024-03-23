package com.britetech.practice2;

import java.util.Arrays;

public class BubbleSort1 {

    private void bubbleSort(int[] a){
      int  n = a.length;
      for (int i=0;i<n;i++){
          boolean issorted =true;
          for (int j=1 ;j<n;j++){
              if (a[j]<a[j-1]){
                  a[j]= a[j]^a[j-1]^(a[j-1]=a[j]);
                /*int temp=  a[j];
                    a[j] =a[j-1];
                    a[j-1]=temp;*/
                  issorted=false;
              }
          }
          if (issorted){
              break;
          }
      }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        BubbleSort1 bubbleSort = new BubbleSort1();
        int[] toSort={23,3,4,50,2,1,100,0,21,51,33};
        bubbleSort.bubbleSort(toSort);

    }
}
