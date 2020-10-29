package com.bridgelabz;

import java.util.LinkedList;

public class EmpWages {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	private int numofCompany=0;
	private LinkedList<CompanyEmpWage>companyEmpWageList;
	
	public EmpWages() {
		companyEmpWageList=new LinkedList<>();
	}
	private void addCompanyEmpWage(String company,int empRatePerHour,int workingDays,int maxHours) {
		CompanyEmpWage	companyEmpWage=new CompanyEmpWage(company, empRatePerHour, workingDays, maxHours);
		companyEmpWageList.add(companyEmpWage);
	}


	private void computeEmpWage(){
		for (int i=0;i<numofCompany;i++){
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWages( companyEmpWage));
			System.out.println(companyEmpWage);
			}
		}
		private int computeEmpWages(CompanyEmpWage companyEmpWage) {
				int emphrs = 0, totalworkingdays = 0, totalEmphrs = 0;
				while (totalEmphrs < companyEmpWage.maxHours && totalworkingdays < companyEmpWage.workingDays) 
				{
					totalworkingdays++;
					int random = (int) Math.floor(Math.random() * 10) % 3;
					switch (random) {

					case 1:
						emphrs = 8;
						break;

					case 2:
						emphrs = 4;
						break;

					default:
						emphrs = 0;

					}
					totalEmphrs += emphrs;
					System.out.println("days" +totalworkingdays+ "Emphrs" +emphrs);
				}
				return totalEmphrs+companyEmpWage.empRateperHour;
				
			}
		public static void main(String[] args) {
			EmpWages empWageBuilder = new EmpWages();
			empWageBuilder.addCompanyEmpWage("HP",20,20,100);
			empWageBuilder.addCompanyEmpWage("Asus",22,23,103);
			empWageBuilder.computeEmpWage();
		}
}
	 


