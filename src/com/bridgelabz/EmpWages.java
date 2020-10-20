package com.bridgelabz;

public class EmpWages {

	public static void main(String[] args) {
	int fullTime=1;
	int partTime=2;
	int Wages_Per_Hour=20;
	int full_Day_Hour=8;
	int Part_Day_Hour=4;
	int checkout=(int) (Math.floor(Math.random() *10) %3);
	System.out.println(checkout);
	if (checkout == fullTime) {
		int Total_Wages=Wages_Per_Hour * full_Day_Hour;
		System.out.println(Total_Wages);
	}
	else if (partTime == checkout) {
		int total=Part_Day_Hour * Wages_Per_Hour;
		System.out.println(total);
	}
		
	}

}
