package com.cvshealth.cj;

import java.util.Scanner;

public class Q9EvenOROdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The entered number "+num+" is even");
		} else {
			System.out.println("The entered number "+num+" is odd");
		}
		
		sc.close();
	}

}
