package oops.abstraction;

public abstract class Partial_Abstraction_Main {
	
	private void userName() {
		System.out.println("User Name");
	}
	
	public abstract void password();
	
	public static void main(String[] args) {
		
		Partial_Abstraction_Main pam=new Partial_Abstraction_Sub();
		pam.userName();
		pam.password();
		
	}

}
