package com.tp1.garage;
import com.tp1.garage.Option;
import com.tp1.garage.Moteur;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Vehicule implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  Double tarifOption = 0.0;
	private  Double prix       = 0.0;
    private  String nom        = " ";
    private  Marque  nomMarque =null; 
    private  Moteur moteur     = null;
    private List<Option> listOption;
     

	//constructeur avec parametre
	public Vehicule(Double prix, String nom, Marque nomMarque) {
	       this.prix       = prix;
	       this.nom        = nom;
	       this.listOption = new ArrayList<Option>();
	       this.nomMarque  = nomMarque;
     }
    
	//Methode en accession(getter)
	public double getPrix() {
		return prix;
	}
    
	 //Methode de modification(setter)
	public void setPrix(double prix) {
		this.prix = prix;
	}
    
	//Methode en accession(getter)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
    
    
	public List<Option> getListOption() {
		return listOption;
	}

	public void setListOption(List<Option> listOption) {
		this.listOption = listOption;
	}

	//Methode en accession(getter)
	public Marque getNomMarque() {
		
		return nomMarque ;
	}

	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}
	 //methode affichage

	@Override
	public String toString() {
		System.out.print("+ Voiture " + nomMarque + " : "	+ moteur.toString()+ "[");
		System.out.println(readOption()+"]");
		System.out.println(" d'une valeur totale de " + (tarifOption+ prix)+"€");
		return "";						 
     	}
	
	public  String readOption() {
	
		for(Option o : listOption)
		{ System.out.print( o.typeOption() + " ("+ o.getPrix() +"€)" + ", ");
		 tarifOption  += o.getPrix(); 
	}
		return "";
	}
	
     //Methode pour  l'ajout d'option 
	public void addOption(Option  option) { 
		     	listOption.add(option);   
	}
	
     public  void setMoteur(Moteur tMoteur) {
    	           this.moteur = tMoteur;
    	     } 
}	

