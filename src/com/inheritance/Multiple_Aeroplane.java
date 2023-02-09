package com.inheritance;

public class Multiple_Aeroplane implements Multiple_Jet_Engine,Multiple_Turbo_Engine {

	@Override
	public void turbo_engine() {
		// TODO Auto-generated method stub
		System.out.println("Turbo Engine");
	}

	@Override
	public void jet_engine() {
		// TODO Auto-generated method stub
		System.out.println("Jet Engine");
	}
	
	private void aeroplane() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane");
	}
	
	public static void main(String[] args) {
		
		Multiple_Aeroplane ma=new Multiple_Aeroplane();
		ma.turbo_engine();
		ma.jet_engine();
		ma.aeroplane();
		
	}

}
