package com.project1;

public class Parent_Class {
	
	public void student_Info(String name) {
		System.out.println("Student Name: "+name);
	}
	public void student_Info(int age, String gender) {
		System.out.println("Student Age: "+age+" "+gender);
	}
	public void student_Info(String address, int pincode) {
		System.out.println("Student Address: "+address+" "+pincode);
	}
	public void student_Info(float fees) {
		System.out.println("Student Fees: "+fees);
	}
	public void student_Info(String fatherName, char fatherInitial) {
		System.out.println("Father name: "+fatherName+" "+fatherInitial);
	}
	public void student_Info(long accountNo) {
		System.out.println("Student Bank Account No.: "+accountNo);
	}
	
	public static void main(String[] args) {
		Parent_Class sd=new Parent_Class();
		sd.student_Info("Arockiam Victor Mark");
		sd.student_Info(40, "Male");
		sd.student_Info("Besant Nagar, Chennai", 600090);
		sd.student_Info(10000f);
		sd.student_Info("Quileen", 'M');
		sd.student_Info(987654321098765l);
	}
}
