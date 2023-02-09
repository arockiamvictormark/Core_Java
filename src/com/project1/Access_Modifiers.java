package com.project1;

public class Access_Modifiers {
	
	public void accessModFirstMethod() {
		System.out.println("Access Mod First Method as Public");
	}
	
	private void accessModSecondMethod() {
		System.out.println("Access Mod Second Method as Private");
	}
	
	protected void accessModThirdMethod() {
		System.out.println("Access Mod Third Method as Protected");
	}
	
	void accessModForthMethod() {
		System.out.println("Access Mod Forth Method as Default");
	}
	
	public static void main(String[] args) {
		System.out.println("This is Access_Modifiers Main Method");
		Access_Modifiers obj=new Access_Modifiers();
		obj.accessModFirstMethod();
		obj.accessModSecondMethod();
		obj.accessModThirdMethod();
		obj.accessModForthMethod();
	}

}
