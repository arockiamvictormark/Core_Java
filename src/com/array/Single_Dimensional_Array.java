package com.array;

public class Single_Dimensional_Array {
	
	public static void main(String[] args) {
		
		int a[]=new int [10];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		for (int b : a) {
			System.out.println(b);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Value of a:"+a[i]);
		}
		
	}

}
