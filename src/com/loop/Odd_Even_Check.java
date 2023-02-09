package com.loop;

import java.util.Scanner;

public class Odd_Even_Check {

	public static void main(String[] args) {

		System.out.println("Enter any number to check ODD or EVEN:");

		Scanner sr=new Scanner(System.in); 
		int check = sr.nextInt(); 
		sr.close();

		if ((check%2)==0) { 
			System.out.println("The number '"+check+"' is EVEN"); 
		}
		else { 
			System.out.println("The number '"+check+"' is ODD"); 
		}

	}

}
