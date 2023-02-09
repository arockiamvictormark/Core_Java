package com.variables;

public class Static_Variable {
	
	static int age=25;
	
	private static void myAge() {
		age=40;
		System.out.println("My Previous Age:"+age);
	}
	
	public static void main(String[] args) {
		
		System.out.println(age);
		myAge();
		int age2 = age;
		System.out.println("My Current Age:"+age2);
		
	}

}
