package com.bridgelabz;

public class EmpWages {

	public static void main(String[] args) {
	int present=1;
	int checkout=(int) (Math.floor(Math.random() *10) %2);
	System.out.println(checkout);
	if (checkout == present) {
		System.out.println("present");
	}
	else
		System.out.println("absent");
	
	
	

	}

}
