package com.bridgelabz;


public class EmpWages {
	public static final int FULL_TIME = 1;
	public static final int PART_TIME=2;
	public static void main(String[] args) {
		EmpWages ew=new EmpWages();
		ew.WagesCalculation();
	}
		public void WagesCalculation(){
			int Wages_Per_Hour=20;
			int full_Day_Hour=8;
			int Part_Day_Hour=4;
			int days=20;
			int workingDays=1;
			int workingHour=0;
			int totalWages=0;
			while (workingDays <= days && workingHour <100 ) {
			int checkout=(int) (Math.floor(Math.random() *10) %2+1);
			System.out.println("the day in "+workingDays+" is "+checkout+" hours");
			switch(checkout){
				case  FULL_TIME:int total=Wages_Per_Hour * full_Day_Hour;
									workingHour=workingHour+full_Day_Hour;
									totalWages=totalWages+total;
									break;
				case PART_TIME :int total1=Wages_Per_Hour * Part_Day_Hour;
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
	 


