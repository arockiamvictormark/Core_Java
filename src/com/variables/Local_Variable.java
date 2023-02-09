package com.variables;

public class Local_Variable {
	
	private void greenTeam() {
		int year=1990;
		year=1991;
		System.out.println("Green Team Year:"+year);
	}
	
	public static void main(String[] args) {
		
		Local_Variable lv=new Local_Variable();
		lv.greenTeam();
		
	}

}
