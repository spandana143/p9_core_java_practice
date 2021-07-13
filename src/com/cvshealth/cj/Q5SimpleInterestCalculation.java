package com.cvshealth.cj;

import java.util.Scanner;

public class Q5SimpleInterestCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		int pAmt=sc.nextInt();
		
		System.out.println("Enter the rate of Interest: ");
		float rate=sc.nextFloat();
		
		System.out.println("Enter the time (years): ");
		int time=sc.nextInt();
		
		double simpleInterest=((pAmt * rate * time) / 100);
		System.out.println("Simple interest is "+simpleInterest);
		
		sc.close();
	}

}
