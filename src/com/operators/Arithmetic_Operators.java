package com.operators;

import java.util.Scanner;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int firstNo = sr.nextInt();
		int secondNo = sr.nextInt();
		
		int addition = firstNo + secondNo;
		int substraction = firstNo - secondNo;
		int multiplication = firstNo * secondNo;
		int division = firstNo / secondNo;
		int modulus = firstNo % secondNo;
		
		System.out.println("Addition: "+addition);
		System.out.println("Substraction: "+substraction);
		System.out.println("Multiplication: "+multiplication);
		System.out.println("Division: "+division);
		System.out.println("Modulus: "+modulus);
		
		sr.close();
		
	}
	
}
