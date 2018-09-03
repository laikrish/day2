package com.capgemini.day2;

public class Reverse {

	public static Object checkReverse(String string) {
		int n= string.length();
		String reverse="";
		for(int i=n-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		// TODO Auto-generated method stub
		
			return reverse;
	}

}
