package com.cvshealth.cj;

import java.util.Scanner;

public class Q8SportsClubMembership {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.next();
		
		System.out.println("Enter the mobile number: ");
		double mobNo=sc.nextDouble();
		
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("\"Congratulation! "+name +" for your successful registration\"");
		}else {
			System.out.println("\"Sorry ! You need to be atleast 18 years old to get membership.\"");
		}
		sc.close();
	}

}
