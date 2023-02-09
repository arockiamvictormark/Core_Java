package com.conditions;

import java.util.Scanner;

public class Bill_Receipt {

	public static void main(String[] args) {
		
		System.out.println("Enter your Bill Amount");
		
		Scanner sr=new Scanner(System.in);
		
		double billAmt = sr.nextDouble();
		sr.close();
		
		double discountAmt,balanceAmt;
		
		if (billAmt<=500) {
			System.out.println("Your Discount is 5%");
			discountAmt=(billAmt*5)/100;
			System.out.println("Your Discount Amount: "+discountAmt);
		} else {
			System.out.println("Your Discount is 10%");
			discountAmt=(billAmt*10)/100;
			System.out.println("Your Discount Amount: "+discountAmt);
		}
		
		balanceAmt=billAmt-discountAmt;
		
		System.out.println("Balance Amount: "+balanceAmt);
		System.out.println("Thank You Sir Have a Nice Day.!!!!!!!");
		
	}
	
}
