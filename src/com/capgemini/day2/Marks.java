package com.capgemini.day2;

public class Marks {

	public static Object CheckMarks(int i, int j, int k) {
		// TODO Auto-generated method stub
		if(i>60 && j>60 && k>60)
		{
			return "passed" ;

		}
		return null;
	}

	public static Object CheckMarks1(int i, int j, int k) {
		// TODO Auto-generated method stub
		if((i>60 && j<60) || (i>60 && k<60) || (j>60 && k>60))
		{
			return "promoted";
		}
		return null;
	}

	public static Object CheckMarks2(int i, int j, int k) {
		// TODO Auto-generated method stub
		if((i<60 && j<60) || (j<60 && k<60) || (k<60 && i<60))
		{
			return "failed";
		}
		return null;
	}

}