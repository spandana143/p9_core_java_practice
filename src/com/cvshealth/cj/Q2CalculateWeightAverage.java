package com.cvshealth.cj;

import java.util.Scanner;

public class Q2CalculateWeightAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of the first person: ");
		int person1 = sc.nextInt();

		System.out.println("Enter the weight of the second person:");
		int person2 = sc.nextInt();
		
		System.out.println("Enter the weight of the third person:");
		int person3 = sc.nextInt();
		
		int sum = person1 + person2 + person3;
		int average = sum/3;
		
		System.out.println("The sum of weight of the 3 persons is "+sum+"kgs and the average weight is "+average+"kgs");
		
		sc.close();
	}

}
