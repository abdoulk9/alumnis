package com.tp1.garage;

public  class MoteurDiesel extends Moteur{

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.DIESEL;
	}
}
