package com.cvshealth.cj;

import java.util.Scanner;

public class Q4SwapNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second num2: ");
		int num2=sc.nextInt();
		
		System.out.println("Before swap, the values of num1 = "+num1 +" and num2 = "+num2);
		
		int swap=num1;
		num1=num2;
		num2=swap;
		
		System.out.println("After swap, the values of num1 = "+num1 + " and num2 = "+num2);
		
		sc.close();	
	}

}
