package com.capgemini.day2;

public class Armstrong {

	public static boolean CheckArmstrong(int n) {
		// TODO Auto-generated method stub
		int sum=0,r,number;
		number=n;
		while(n>0)
		{
		
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(sum==number)
		return true;
		else
		return false;

	}

}
