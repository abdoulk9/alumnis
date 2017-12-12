package com.tp1.garage;

public class MoteurHybride extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		this.type =TypeMoteur.HYBRIDE;
    }
}
	
