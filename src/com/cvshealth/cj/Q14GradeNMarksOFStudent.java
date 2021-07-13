package com.cvshealth.cj;

import java.util.Scanner;

public class Q14GradeNMarksOFStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject: ");
		int subj1=sc.nextInt();
		
		System.out.println("Enter the marks scored in 2nd subject: ");
		int subj2=sc.nextInt();
		
		System.out.println("Enter the marks scored in 3rd subject: ");
		int subj3=sc.nextInt();
		
		int totalMarks = subj1 + subj2 + subj3;
		int averageMarks = totalMarks/3;
		
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Average is: "+averageMarks);
		
		if(averageMarks<35) {
			System.out.println("Grade: \"C\"");
		} else if(averageMarks>=36 && averageMarks<=60) {
			System.out.println("Grade: \"B\"");
		} else {
			System.out.println("Grade: \"A\"");
		}
		
		sc.close();
	}

}
