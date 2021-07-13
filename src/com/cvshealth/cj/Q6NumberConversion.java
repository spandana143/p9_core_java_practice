package com.cvshealth.cj;

import java.util.Scanner;

public class Q6NumberConversion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(num<0) {			
			System.out.println("The result is: "+Math.abs(num));
		}
		
		sc.close();
	}

}
