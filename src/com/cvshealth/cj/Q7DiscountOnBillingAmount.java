package com.cvshealth.cj;

import java.util.Scanner;

public class Q7DiscountOnBillingAmount {

	public static void main(String[] args) {
		
		double discount;
		double billAmount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the billing amount: ");
		int amount=sc.nextInt();
		
		if(amount>6000) {
			discount= amount * 0.1;
			billAmount= amount - discount;
			System.out.println("Your net billing amount: "+billAmount);
		}else {
			System.out.println("Your net billing amount: "+amount);
		}
		

		sc.close();
		/*
		 * Expected output:
		 * 
		 * Enter the billing amount: 6500 Your net billing amount: 5850
		 * 
		 * Enter the billing amount: 5500 Your net billing amount: 5500
		 */
	}

}
