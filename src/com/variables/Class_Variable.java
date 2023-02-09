package com.variables;

public class Class_Variable {
	
	int year=1991;
	
	private void sunMicroSys() {
		int year=1995;
		System.out.println("Sun Microsystems Year:"+year);
	}
	
	public static void main(String[] args) {
		
		Class_Variable cv=new Class_Variable();
		System.out.println("Java:"+cv.year);
		int gtYear = cv.year;
		System.out.println("Green Team Year:"+gtYear);
		cv.sunMicroSys();
		
	}

}
