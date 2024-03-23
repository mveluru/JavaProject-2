package com.britetech.practice1;


public class Question6 {
	 String str;
	 Question6(String str) {
         this.str = str;
     }
	  
	 
	     public static void main(String[] args) {
	    	 String [] fruits = {"apple", "banana", "mango", "orange"};
	         for(String fruit : fruits) {
	             System.out.print(fruit + " ");
	             if(fruit.equals("mango")) {
	                 continue;
	             }
	             System.out.println("salad!");
	             break;
	         }        
	     }
}

