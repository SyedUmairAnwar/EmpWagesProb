package com.bridgelabz;

public class EmpWages {

	public static void main(String[] args) {
	int present=1;
	int Wages_Per_Hour=20;
	int full_Day_Hour=8;
	int checkout=(int) (Math.floor(Math.random() *10) %2);
	System.out.println(checkout);
	if (checkout == present) {
		int Total_Wages=Wages_Per_Hour * full_Day_Hour;
		System.out.println(Total_Wages);
	}
	else
		System.out.println("absent");
	
	
	

	}

}
