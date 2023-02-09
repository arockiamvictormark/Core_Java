package com.string.functions;

public class String_Functions {
	
	public static void main(String[] args) {
		
		String firstName="Arockiam Victor";
		String lastName="Mark";
		int length = firstName.length();
		System.out.println("Length is: "+length);
		boolean equals = firstName.equals(lastName);
		System.out.println("Equal String?: "+equals);
		boolean equalsIgnoreCase = lastName.equalsIgnoreCase("mark");
		System.out.println("Equals Ignore Case: "+equalsIgnoreCase);
		String upperCase = firstName.toUpperCase();
		System.out.println("First Name in UpperCase: "+upperCase);
		String lowerCase = lastName.toLowerCase();
		System.out.println("Last Name in LowerCase: "+lowerCase);
		char charAt = firstName.charAt(9);
		System.out.println("Char at first name: "+charAt);
		int indexOf = firstName.indexOf('i');
		System.out.println("Index of first name: "+indexOf);
		int lastIndexOf = firstName.lastIndexOf('i');
		System.out.println("Last Index of first name: "+lastIndexOf);
		boolean contains = firstName.contains("roc");
		System.out.println("Contains: "+contains);
		boolean startsWith = firstName.startsWith("Ar");
		System.out.println("Starts with?: "+startsWith);
		boolean endsWith = firstName.endsWith("or");
		System.out.println("Ends with?: "+endsWith);
		String city="  I live in Madras, capital of TN is Madras   ";
		String trim = city.trim();
		System.out.println("Trim: "+trim);
		String replace = city.replace("Madras", "Chennai");
		System.out.println("Replaced city name: "+replace);
		String replaceAll = city.replaceAll("Madras", "Chennai");
		System.out.println("Replaced All: "+replaceAll);
		String fullName = firstName.concat(" "+lastName);
		System.out.println("My full name is: "+fullName);
		String nickName = firstName.substring(9);
		System.out.println("My nick name is: "+nickName);
		String substringRange = city.substring(12, 33).replace("Madras", "Chennai");
		System.out.println("Substring Range: "+substringRange);
		String join = String.join(" + ", firstName,lastName,city);
		System.out.println("Full name joined: "+join);
		String area="";
		boolean emptyCheck = area.isEmpty();
		System.out.println("String Empty?: "+emptyCheck);
		String[] splitChar = firstName.split("");
		String[] splitSpace = firstName.split(" ");
		
		for (String string1 : splitChar) {
			System.out.println(string1);
		}
		
		for (String string2 : splitSpace) {
			System.out.println(string2);
		}
		
	}

}
