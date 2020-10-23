package com.bridgelabz;


public class EmpWages {
	public static final int FULL_TIME = 1;
	public static final int PART_TIME=2;
	public static void main(String[] args) {
		EmpWages ew=new EmpWages();
		ew.WagesCalculation();
	}
		public void WagesCalculation(){
			int Wages_Per_Hour=0;
			int company=(int) (Math.floor(Math.random() *10) %3+1);
			switch (company) {
			case 1: Wages_Per_Hour=20;
					System.out.println("company is Hp having wage for hour is 20");
					break;
			case 2: Wages_Per_Hour=40;
					System.out.println("company is lenovo having wage for hour is 40");
					break;
				
			case 3: Wages_Per_Hour=60;
					System.out.println("company is dell having wage for hour is 60");
					break;
			}
			
			int full_Day_Hour=8;
			int Part_Day_Hour=4;
			int days=20;
			int workingDays=1;
			int workingHour=0;
			int totalWages=0;
			while (workingDays <= days && workingHour <100 ) {
			int checkout=(int) (Math.floor(Math.random() *10) %2+1);
			switch(checkout){
				case  FULL_TIME:int total=  Wages_Per_Hour * full_Day_Hour;
									workingHour=workingHour+full_Day_Hour;
									totalWages=totalWages+total;
									break;
				case PART_TIME :int total1= Wages_Per_Hour * Part_Day_Hour;
									workingHour=workingHour + Part_Day_Hour;
									totalWages=totalWages+total1;
									break;
				default : System.out.println("0");
			}
			workingDays++;					
			}
			System.out.println("total wages in month="+ totalWages);
			System.out.println("total working hours is "+workingHour);
		}
	
}
	 


