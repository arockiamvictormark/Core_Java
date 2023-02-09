package casting.classobject;

public class Upcasting_Overriding_Parent {
	
	public void student_Info(String name) {
		System.out.println("Student Name: "+name);
	}
	public void student_Info(int age, String gender) {
		System.out.println("Student Age: "+age+" "+gender);
	}
	public void student_Info(String address, int pincode) {
		System.out.println("Student Address: "+address+" "+pincode);
	}
	
	public static void main(String[] args) {
		Upcasting_Overriding_Parent uop=new Upcasting_Overridden_Child();
		uop.student_Info("Arockiam Victor Mark");
		uop.student_Info(40, "Male");
		uop.student_Info("Besant Nagar, Chennai", 600090);
	}

}
