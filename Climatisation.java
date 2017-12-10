package com.projet1.garage;

public class Climatisation implements Option {

	
	public void Climatisation() {
		
		getPrix();
		nomOption();
	}
	@Override
	public Double getPrix() {
		return 300.23;
	}
	
	//renvoi le nom de l'option
	public String nomOption() {
		
		return "\t Climatisation";
	}
	
}
