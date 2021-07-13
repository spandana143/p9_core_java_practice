package com.cvshealth.cj;

import java.util.Scanner;

public class Q11AcceptTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number num2: ");
		int num2=sc.nextInt();
		
		int result=num1-num2;
		System.out.println("The result (difference) is: "+Math.abs(result));
		
		sc.close();
	}

}
