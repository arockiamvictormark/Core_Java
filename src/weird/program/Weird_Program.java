package weird.program;

import java.util.Scanner;

public class Weird_Program {
	
	public static void main(String[] args) {
		
		System.out.println("Enter integer number to check ODD or EVEN:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		if (number%2!=0) {
			System.out.println("WEIRD :- the number "+number+" is ODD");
		} else {
			if(number>=2 && number<=5)
				System.out.println("Not Weird :- the number "+number+" is EVEN and in the inclusive range of 2 to 5");
			if(number>=6 && number<=20)
				System.out.println("WEIRD :- the number "+number+" is EVEN and in the inclusive range of 6 to 20");
			if(number>20)
				System.out.println("Not Weird :- the number "+number+" is EVEN and greater than 20");
		}
		
	}

}
