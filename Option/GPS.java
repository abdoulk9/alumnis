package com.tp1.garage;

public class GPS implements Option {

	@Override
	public Double getPrix() {
		return 113.5;
	}
    
	public String typeOption() {
		return "GPS";
	}
}
