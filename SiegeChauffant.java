package com.projet1.garage;

public class SiegeChauffant implements Option {
    
	
	public void  SiegeChauffant() {
		getPrix();
		nomOption();
	}
	
	//implementation de la methode getPrix de la classe abstract
	@Override
	public Double getPrix() {
		return 102.23;
	}
	//Renvoi le nom de l'option
   public String nomOption() {
	   
	    return "\n Siege Chauffant";
   }
	
}
