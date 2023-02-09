package com.inheritance;

public class Hierarchical_Second_Child extends Hierarchical_Parent {
	
	private void boat() {
		System.out.println("Hierarchical Second Child Boat");
	}
	
	public static void main(String[] args) {
		Hierarchical_Second_Child hsc=new Hierarchical_Second_Child();
		hsc.cruise();
		hsc.boat();
	}

}
