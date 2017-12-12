package com.tp1.garage;

public  class MoteurElectrique  extends Moteur{

	 //Constructeur en faisant appel au consructeur de la classe mère
	public MoteurElectrique( String cylindre, Double prix) {
		super(cylindre, prix);
		this.type= TypeMoteur.ELECTRIQUE;
	}

}
