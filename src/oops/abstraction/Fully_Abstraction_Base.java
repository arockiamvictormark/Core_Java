package oops.abstraction;

public interface Fully_Abstraction_Base {
	
	void savings_account();
	void current_account();
	void fixed_deposit_account();
	
	public static void main(String[] args) {
		
		Fully_Abstraction_Base fab=new Fully_Abstraction_Derived();
		fab.savings_account();
		fab.current_account();
		fab.fixed_deposit_account();
		
	}

}
