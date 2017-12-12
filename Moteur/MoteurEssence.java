package com.tp1.garage;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		this.type =TypeMoteur.ESSENCE;
	}
}
