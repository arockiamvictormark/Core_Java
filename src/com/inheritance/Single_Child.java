package com.inheritance;

public class Single_Child extends Single_Parent {
	
	private void rocket() {
		System.out.println("Single Child Rocket");
	}
	
	public static void main(String[] args) {
		Single_Child sc=new Single_Child();
		sc.aeroplane();
		sc.helicopter();
		sc.rocket();
	}

}
