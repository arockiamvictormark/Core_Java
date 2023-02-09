package com.operators;

public class Unary_Operators {	
	
	public static void main(String[] args) {
		
		int x=10;
		System.out.println("x:"+x);
		int a=++x;						//Pre-increment operator	
		System.out.println("x:"+x);
		System.out.println("a:"+a);
		
		System.out.println("\n");
		
		int y=20;
		System.out.println("y:"+y);
		int b=y++;						//Post-increment operator
		System.out.println("y:"+y);
		System.out.println("b:"+b);
		
		System.out.println("\n");
		
		int z=30;
		System.out.println("z:"+z);
		z=z++;							//Post-increment operator (Special Case)
		System.out.println("z:"+z);
		
	}

}
