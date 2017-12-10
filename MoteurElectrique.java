package com.projet1.garage;

public  class MoteurElectrique  extends Moteur{

	 //Constructeur en faisant appel au consructeur de la classe mère
	public MoteurElectrique( String cylindre, Double prix) {
		super(cylindre, prix);
	}
    
	public TypeMoteur getTyper(){
		return TypeMoteur.ELECTRIQUE;
	}
	
}
