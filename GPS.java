package com.projet1.garage;

public class GPS implements Option {
  
	 public void  GPS() {
		
		getPrix();
		this.nomOption();
		// TODO Auto-generated constructor stub
	}
	 

	//renvoi le prix de l'option
	@Override
	public Double getPrix() {
		return 89.5 ;
	}
	
	//renvoi le nom de l'option
	public String nomOption() {
		
		return "\tGPS";	
	}
}
