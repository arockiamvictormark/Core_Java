package com.project1;

public class Child_Class extends Parent_Class {

	@Override
	public void student_Info(String name) {
		super.student_Info(name);
	}
	@Override
	public void student_Info(int age, String gender) {
		super.student_Info(age, gender);
	}
	@Override
	public void student_Info(String address, int pincode) {
		super.student_Info(address, pincode);
	}
	@Override
	public void student_Info(float fees) {
		super.student_Info(fees);
	}
	@Override
	public void student_Info(String fatherName, char fatherInitial) {
		super.student_Info(fatherName, fatherInitial);
	}
	@Override
	public void student_Info(long accountNo) {
		super.student_Info(accountNo);
	}
	public static void main(String[] args) {
		Child_Class obj=new Child_Class();
		obj.student_Info("Victor");
		obj.student_Info(25, "M");
		obj.student_Info("Anna Colony", 90);
		obj.student_Info(150f);
		obj.student_Info("Mark", 'Q');
		obj.student_Info(1122334455l);
	}
}
