package com.capgemini.day2;

public class SearchString {

	public static Object checkString(String string) {
		String s[]= {"krishna","Chaitanya","Anvi","Mom","Dad","Veni","krishna","anvi","chaitanya","mom","dad","veni","veni","veni"};
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].compareTo(string)==0)
			count++;
		}

			return count+1;
			
			}
			
			
	}


