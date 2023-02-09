package com.inheritance;

public class Hierarchical_First_Child extends Hierarchical_Parent {
	
	private void ship() {
		System.out.println("Hierarchical First Child Ship");
	}
	
	public static void main(String[] args) {
		Hierarchical_First_Child hfc=new Hierarchical_First_Child();
		hfc.cruise();
		hfc.ship();
	}

}
