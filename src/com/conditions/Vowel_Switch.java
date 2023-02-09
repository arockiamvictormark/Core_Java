package com.conditions;

import java.util.Scanner;

public class Vowel_Switch {

	public static void main(String[] args) {
		
		System.out.println("Enter any Letter to check if vowel");
		
		Scanner sr=new Scanner(System.in);
		String vowelChk = sr.next();
		sr.close();
		
		switch (vowelChk) {
		case "a":
			System.out.println("Given letter '"+vowelChk+"' is a Vowel");
			break;
		case "e":
			System.out.println("Given letter '"+vowelChk+"' is a Vowel");
			break;
		case "i":
			System.out.println("Given letter '"+vowelChk+"' is a Vowel");
			break;
		case "o":
			System.out.println("Given letter '"+vowelChk+"' is a Vowel");
			break;
		case "u":
			System.out.println("Given letter '"+vowelChk+"' is a Vowel");
			break;

		default:
			System.out.println("Given letter '"+vowelChk+"' is a Consonant");
			break;
		}
		
	}
	
}
