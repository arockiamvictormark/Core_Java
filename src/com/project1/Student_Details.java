package com.project1;

public class Student_Details {
	
	private void student_Info(String name) {
		System.out.println("Student Name: "+name);
	}
	private void student_Info(int age, String gender) {
		System.out.println("Student Age: "+age+" "+gender);
	}
	private void student_Info(String address, int pincode) {
		System.out.println("Student Address: "+address+" "+pincode);
	}
	private void student_Info(float fees) {
		System.out.println("Student Fees: "+fees);
	}
	private void student_Info(String fatherName, char fatherInitial) {
		System.out.println("Father name: "+fatherName+" "+fatherInitial);
	}
	private void student_Info(long accountNo) {
		System.out.println("Student Bank Account No.: "+accountNo);
	}
	
	public static void main(String[] args) {
		Student_Details sd=new Student_Details();
		sd.student_Info("Arockiam Victor Mark");
		sd.student_Info(40, "Male");
		sd.student_Info("Besant Nagar, Chennai", 600090);
		sd.student_Info(10000f);
		sd.student_Info("Quileen", 'M');
		sd.student_Info(987654321098765l);
	}

}
