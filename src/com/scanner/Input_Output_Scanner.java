package com.scanner;

import java.util.Scanner;

public class Input_Output_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName = sr.nextLine();
		System.out.println("Enter Last Name:");
		String lastName = sr.next();
		System.out.println("Enter Age:");
		int age = sr.nextInt();
		System.out.println("Enter Fees:");
		float fees = sr.nextFloat();
		System.out.println("Enter Course:");
		String course = sr.next();
		
		System.out.println("\nFirst Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Fees: "+fees);
		System.out.println("Course: "+course);
		
		sr.close();
	}

}
