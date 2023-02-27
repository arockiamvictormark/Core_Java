package famous.legends;

import java.util.Scanner;

public class Armstrong_Number {	// 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong:");
		int number = sc.nextInt(); //153
		sc.close();
		
		int tempNum, digit, n = 0, armNum = 0;
		tempNum=number;
		while (tempNum!=0) {
			tempNum = tempNum/10; //153 / 10 = 15
			n++;
		}
		tempNum=number;
//		int digMul=1;
		while (tempNum!=0) {
			digit = tempNum % 10; //153 % 10 = 3
			armNum += Math.pow(digit, n);
//			digMul=1;
//			for (int i = 1; i <= n; i++) {
//				digMul=digMul*digit;
//			}
//			armNum+=digMul;
			tempNum = tempNum/10;
		}
		if (number==armNum) { 
			System.out.println("Given number "+number+" is an Armstrong Number");
		} else {
			System.out.println("Given number "+number+" is not an Armstrong Number");
		}
		
	}

}
