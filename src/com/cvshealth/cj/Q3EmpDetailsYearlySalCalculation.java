package com.cvshealth.cj;

import java.util.Scanner;

public class Q3EmpDetailsYearlySalCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EmpNo: ");
		int empno=sc.nextInt();
		
		System.out.println("Enter the Employee name: ");
		String empname=sc.next();
		
		System.out.println("Enter the monthly salary: ");
		int empsal=sc.nextInt();
		
		int yearlysal=empsal * 12;
		System.out.println("Hi "+empname + "! Your employee ID is "+empno 
				+", monthly salary is Rs."+ empsal 
				+"/- and yearly salary is Rs. "+ yearlysal +"/-");
		sc.close();
	}

}
