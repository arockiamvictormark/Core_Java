package famous.legends;

import java.util.Scanner;

public class Palindromes { // MADAM // 34543
	
	public static void main(String[] args) {
		numericPalindrome();
		stringPalindrome();
	}
	
	private static void numericPalindrome() {
		System.out.println("Enter range to display palindrome");
		Scanner sc = new Scanner(System.in);
		int palInt = sc.nextInt();
		sc.close();
		int tempNum, digit, palValue = 0;
		
		for(int i=1;i<=palInt;i++) {
			tempNum  = i;
			while (tempNum!=0) {
				digit = tempNum%10;
				palValue = (palValue*10) + digit;
				tempNum = tempNum/10;
			}
			if(palValue==i)
				System.out.print(palValue+" ");
			palValue = 0;
		}
		System.out.println();
	}
	
	private static void stringPalindrome() {
		System.out.println("Enter string to check palindrome");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		int n = input.length()-1;
		String palString = "";
		for (int i = n; i >= 0; i--) {
			palString = palString + input.charAt(i);		
		}
		System.out.println("palString: "+palString);
	}

}
