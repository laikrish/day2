package com.capgemini.day2;

public class Tax {

	public static double checkTax(double ctc) {
		double tax=0;
		if(ctc> 0 && ctc<=180000)
		 {
			 return 0;
			 
		 }
		 else if(ctc>181001 && ctc<=300000)
		 {
			 tax=(ctc*10)/100;
return tax;
			
		 }
		 else if(ctc>300001 && ctc<=500000)
		 {
			 tax=(ctc*20)/100;
			 return tax;
		 }
		 else if (ctc>500001 && ctc<=1000000)
		 {
			 tax=(ctc*30)/100;
			 return tax;
		 }
		// TODO Auto-generated method stub
		return tax;
		
		
	}

}
