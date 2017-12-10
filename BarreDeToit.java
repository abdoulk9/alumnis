package com.projet1.garage;

public class BarreDeToit implements Option {

	
	public BarreDeToit() {
		getPrix();
		nomOption();
	}
	 //renvoi le prix de l'option
	@Override
	public Double getPrix() {
		return this.getPrix();
	}
    //Renvoi  l'option
	public String nomOption() {

		return "\n Barre de toit";
	}	
}
