package com.projet1.garage;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Vehicule implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  Double prix       = 0.0;
    private  String nom        = " ";
    private  Marque  nomMarque =null; 
    private  Moteur moteur     = null;
    private List<Option> listOption = new ArrayList<Option>();
     
   //Constructeur par defaut
    public Vehicule() {
	this.prix      = 0.0;
	this.nom       = null;
	this.nomMarque  =null;
	this.listOption = null;
    }

	//constructeur avec parametre
	public Vehicule(Double prix, String nom, List<Option> listOption, Marque nomMarque) {
	this.prix       = prix;
	this.nom        = nom;
	this.listOption = listOption;
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

	public  String toString() {
		String str= "Voiture" + getNomMarque() + ":" + getNom() + " Moteur " + moteur.toString() +" "+ moteur.getCylindre() +
				"prix =" + getPrix() + " + listOption + " ;
				
		return str;
	}
     //Methode pour  l'ajout d'option 
	public void addOption(Option  option) { 
		        System.out.println("\tentré ok");
		     	listOption.add(option);   
		     	 System.out.println("sortie ok\n");
	}
	
     public  void setMoteur(Moteur tMoteur) {
    	           moteur = tMoteur;
    	     } 
}	

