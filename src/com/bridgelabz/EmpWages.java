package com.bridgelabz;


public class EmpWages {

	public static void main(String[] args) {
	int fullTime=1;
	int partTime=2;
	int Wages_Per_Hour=20;
	int full_Day_Hour=8;
	int Part_Day_Hour=4;
	int days=20;
	int workingDays=0;
	int workingHour=1;
	int totalWages=0;
	while (workingDays <= days && workingHour <=100 ) {
	int checkout=(int) (Math.floor(Math.random() *10) %2+1);
	System.out.println(checkout);
	switch(checkout){
		case 1 :int total=Wages_Per_Hour * full_Day_Hour;
							workingHour=workingHour+full_Day_Hour;
							totalWages=totalWages+total;
							break;
		case 2 :int total1=Wages_Per_Hour * Part_Day_Hour;
							workingHour=workingHour + Part_Day_Hour;
							totalWages=totalWages+total1;
							break;
		default : System.out.println("0");
	}
	workingDays++;					
	}
	System.out.println("total wages in month="+ totalWages);
	}
}


