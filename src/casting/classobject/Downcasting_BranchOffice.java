package casting.classobject;

public class Downcasting_BranchOffice extends Downcasting_HeadOffice {
	
	@Override
	public void manager(String mgr) {
		System.out.println(mgr);
	}
	@Override
	public void team_leader(String tl) {
		System.out.println(tl);
	}
	public void associate(String asst) {
		System.out.println("Associate: "+asst);
	}
	
	public static void main(String[] args) {
		
		Downcasting_BranchOffice db=(Downcasting_BranchOffice) new Downcasting_HeadOffice();
		db.manager("Mohan");
		db.team_leader("Rajesh");
		db.associate("Sanjay");
		
	}

}
