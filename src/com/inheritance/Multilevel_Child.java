package com.inheritance;

public class Multilevel_Child extends Multilevel_Parent {
	
	private void bike() {
		System.out.println("Multilevel Child Bike");
	}

	public static void main(String[] args) {
		Multilevel_Child mc=new Multilevel_Child();
		mc.walking();
		mc.cycle();
		mc.bike();
	}
}
