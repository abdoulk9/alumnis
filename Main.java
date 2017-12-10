package com.projet1.garage;

public class Main {

	    public static void main(String[] args) {
	   	 Garage garage = new Garage();   
	   	 System.out.println(garage);
	   	 
	   	Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 garage.addVoiture(A300B_2);
	   	 
	}

}
