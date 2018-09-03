package com.capgemini.day2;

public class Discount {

	public static Object CheckDprice(int i, int j) {
		// TODO Auto-generated method stub
		
		int newItemPrice;
		newItemPrice=i-((i*j)/100);
		return newItemPrice;
	}

}
