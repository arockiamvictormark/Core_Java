package casting.classobject;

public class Upcasting_Overridden_Child extends Upcasting_Overriding_Parent {
	
	@Override
	public void student_Info(String name) {
		System.out.println("Student Name: Victor");
	}
	@Override
	public void student_Info(int age, String gender) {
		System.out.println("Student Age: 25");
	}
	@Override
	public void student_Info(String address, int pincode) {
		System.out.println("Student Address: Chennai");
	}
	
	public void student_Info(float fees) {
		System.out.println("Fees: "+fees);
	}
	public void student_Info(String fatherName, char fatherInitial) {
		System.out.println("Father: "+fatherName+" "+fatherInitial);
	}
	public void student_Info(long accountNo) {
		System.out.println("Bank Account No.: "+accountNo);
	}

}
