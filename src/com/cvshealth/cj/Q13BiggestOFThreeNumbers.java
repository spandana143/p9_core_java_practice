package com.cvshealth.cj;

import java.util.Scanner;

public class Q13BiggestOFThreeNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number num2: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter the 2nd number num2: ");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("The biggest of the 3 numbers entered is: "+num1);
		} else if(num2>num3) {
			System.out.println("The biggest of the 3 numbers entered is: "+num2);
		}else {
			System.out.println("The biggest of the 3 numbers entered is: "+num3);
		}
		
		sc.close();
	}

}
