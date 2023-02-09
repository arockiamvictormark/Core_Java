package com.variables;

public class Final_Variable {
	
	final int year=2010;
	
	private void oracle() {
		System.out.println("Oracle year:"+year);
	}
	
	public static void main(String[] args) {
		
		Final_Variable fv=new Final_Variable();
		fv.oracle();
		
	}

}
