package com.projet1.garage;
import java.io.Serializable;
  public abstract class  Moteur implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TypeMoteur type; 
	 private String cylindre;
	 private Double prix;
	 
	//Constructeur de la classe 
	 public Moteur(String cylindre, Double prix) {
			this.cylindre = cylindre;
			this.prix = prix;
			
		}   
	//Methode  en accession(getter)
	public Double getPrix() {
		return prix;
	}

	public String getCylindre(){
		return cylindre;
	}
	
	//methode toString pour l'affichage 
		@Override
		public String toString() {
			return "Moteur [type=" + type + ", cylindre=" + cylindre + ", prix=" + prix + "]";
	} 
}
