package com.projet1.garage;
public  class MoteurDiesel extends Moteur{

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		// TODO Auto-generated constructor stub
	}

	
	public TypeMoteur getType() {
		
		return TypeMoteur.DIESEL;
	}
	

}
