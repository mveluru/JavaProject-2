package com.britetech.practice1;

public class Palindrom {
	
	public boolean palindrom(String pal){
		
		StringBuilder sb = new StringBuilder();
		for (int i=pal.length()-1;i>=0;i--){
			sb =sb.append(pal.charAt(i));
		}
		
		return sb.toString().equalsIgnoreCase(pal);
	}

	public boolean isPalindrom(String pal){
		StringBuilder sb = new StringBuilder();
		sb.append(pal);
		if (pal.equalsIgnoreCase(sb.reverse().toString())){
			return true;
		}else{
			return false;
		}


	}
public static void main(String[] args) {
	Palindrom p = new Palindrom();
	System.out.println("is palindrom "+p.palindrom("LEVEL"));
	System.out.println("is palindrom "+p.isPalindrom("LEVEL"));
	System.out.println("is palindrom "+p.palindrom("Murali"));
	
}
}
