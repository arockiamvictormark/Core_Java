package com.variables;

public class Final_Variable_Main {

	final int age=35;
	
	public final void finalAge() {
		int age=40;
		System.out.println("My Current Age:"+age);
	}
	
	public static void main(String[] args) {
		
		Final_Variable_Main fvm=new Final_Variable_Main();
		fvm.finalAge();
		
	}
}
