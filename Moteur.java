package tp1;

  abstract class  Moteur{
	
	 prptected  TypeMoteur type; 
	 protected  String cylindre;
	  protected  Double prix;
	 
	//Constructeur de la classe 
	 public Moteur(String cylindre, Double prix) {
			super();
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
