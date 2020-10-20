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
	switch(checkout){
		case 1 :int total=Wages_Per_Hour * full_Day_Hour;
							System.out.println(total);
							break;
		case 2 :int total1=Wages_Per_Hour * Part_Day_Hour;
							System.out.println(total1);
							break;
		default : System.out.println("0");
	}
						
	}
	}


