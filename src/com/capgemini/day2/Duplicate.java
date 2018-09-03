package com.capgemini.day2;

public class Duplicate {

	public static Object checkDuplicate(String string) {
		String str="";
		int n=string.length();

		for (int i = 0; i < n; i++) 
	    {
	        
	        char c = string.charAt(i);
	      //if c is present in str it returns index of c else -1
	        
	        if (str.indexOf(c) < 0)
	        {
	         
	            str=str+c;
	            
	        }
	    }
		
		
		// TODO Auto-generated method stub
		return str;
	}

}
