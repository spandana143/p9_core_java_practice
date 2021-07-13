package com.cvshealth.cj;

import java.util.Scanner;

public class Q12PrivilegedCustomers {

	public static void main(String[] args) {
		
		double billAmount, discount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		int amount=sc.nextInt();
		
		System.out.println("Do you have a member card? ");
		boolean confirm=sc.nextBoolean();
		
		if(confirm==true) {
			discount= amount*0.1;
			billAmount=amount-discount;
			System.out.println("Thank You! Your total bill amount is Rs. "
					+amount+"/-, discount is Rs. "+discount+"/- and net amount payable is Rs. "
							+billAmount+"/-.");
		}else {
			discount=amount*0.03;
			billAmount=amount-discount;
			System.out.println("Thank You! Your total bill amount is Rs. "
					+amount+"/-, discount is Rs. "+discount+"/- and net amount payable is Rs. "
							+billAmount+"/-.");
		}
		
		sc.close();
	}

}
