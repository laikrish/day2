package com.capgemini.day2;

public class Interest {



	public static double checkInterest(double p, double t, double r) {
		
		// TODO Auto-generated method stub
		double si;
		
	
		si = (p * t * r) / 100;

		 

			return si;
	}

	public static double checkCiInterest(double p, double t, double r) {
		// TODO Auto-generated method stub
		double ci;
		 ci= p * Math.pow (1.0 + r/100.0,t)-p ;
		return ci;
	}

}


