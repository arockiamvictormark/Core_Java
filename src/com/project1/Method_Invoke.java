package com.project1;

public class Method_Invoke {
	
	private void firstMethod() {
		System.out.println("This is my first method");
	}
	
	private void secondMethod() {
		System.out.println("This is my second method");
	}
	
	public static void main(String[] args) {
		
		Method_Invoke obj1 = new Method_Invoke();
		obj1.secondMethod();
		obj1.firstMethod();
		obj1.secondMethod();
		
	}

}
