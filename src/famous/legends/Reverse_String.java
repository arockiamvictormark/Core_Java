package famous.legends;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		System.out.println("Input string to reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Given String: "+str);
		char ch;
		String rstr = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			ch = str.charAt(i);
			rstr = ch + rstr;
			
		}
		
		System.out.println("Reversed String: "+rstr);
		
		sc.close();
		
//		String s = "green";
//		String k="";
//		for(int i=s.length()-1;i>=0;i--) {
//			k=k+s.charAt(i);
//		}
//		System.out.println(k);

	}

}
