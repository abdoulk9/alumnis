package com.tp1.garage;

public class VitreElectrique implements Option {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 212.35;
	}
	public String typeOption() {
		return "Vitre electrique";
	}
}
