package com.inheritance;

public class Hierarchical_Third_Child extends Hierarchical_Parent {
	
	private void yatch() {
		System.out.println("Hierarchical Third Child Yatch");
	}
	
	public static void main(String[] args) {
		Hierarchical_Third_Child hrc=new Hierarchical_Third_Child();
		hrc.cruise();
		hrc.yatch();
	}

}
