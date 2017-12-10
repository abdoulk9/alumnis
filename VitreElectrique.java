package com.projet1.garage;

public class VitreElectrique implements Option {
	
	public VitreElectrique() {
		getPrix();
		nomOption();
	}
    //implementation de la methode getPrix de la classe abstraite 
	@Override
	public Double getPrix() {
		return this.getPrix();
	}
	
	
	public String nomOption() {
		// TODO Auto-generated method stub
		return "\t Vitre Electrique";
	}
}
