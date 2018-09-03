package com.capgemini.day2;

public class Username {

	public static Object checkScreen(String username,String password) {
		// TODO Auto-generated method stub
		String uname="krishna";
		String pw="capgemini";
		int count=0;
		while(count<3)
		{
		if(uname.equals(username) && pw.equals(password))
		{
			return "Welcome";
	
		}
		else {
			count++;
		}		
		 if(count!=3)
		 {
				return "Something wrong";
	
		}
	
			if(count==3)
			{
				return "Contact admin";
			}
			
		
			
		}
		return count;	
	}
		

}
