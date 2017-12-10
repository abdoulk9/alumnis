package com.projet1.garage;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
	
	}

	public TypeMoteur geType() {
		return TypeMoteur.ESSENCE ;
	}
}
