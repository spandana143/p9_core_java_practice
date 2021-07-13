package com.cvshealth.cj;

import java.util.Scanner;

public class Q10BiggestNumberOFTwo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number num2: ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("The bigger of the two numbers entered ("+num1+" and "+num2+") is: "+num1);
		} else {
			System.out.println("The bigger of the two numbers entered ("+num1+" and "+num2+") is: "+num2);
		}
		
		sc.close();
	}

}
