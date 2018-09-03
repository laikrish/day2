package com.capgemini.day2;

public class Palindrome {

	public static Object checkPalindrome(int n) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
