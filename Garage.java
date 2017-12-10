package com.projet1.garage;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Garage {
	 private  List<Vehicule> Voitures = new ArrayList<Vehicule>();
	
	//Declaration des objets en dehors du bloc try/catch
    ObjectInputStream ois = null;
    ObjectOutputStream oos = null;
    
  // Vehicule[] tabVoiture = new Vehicule[];
    
    public void addVoiture(Vehicule Voit) {  
    	 try {
    	  oos = new ObjectOutputStream(
    			  new FileOutputStream(
                  new File("garage.txt")));
    	   Voitures.add(Voit);
    	   oos.writeObject(Voitures); 
    	//fermeture du flux
     	oos.close(); 
    	 }catch(IOException e) {
    		 e.printStackTrace();
    	 }
       } 
    public String toString() {
         try {          	 
  		     ois = new ObjectInputStream(
  	                new BufferedInputStream(
  	                  new FileInputStream(
  	                  new File("garage.txt"))));
  		  try {
		  System.out.println("***************************");
		  System.out.println("*  Garage OpenClassrooms  *");
		  System.out.println("***************************\n");
		   for (Vehicule v : Voitures)
		   	 return  ((Vehicule)ois.readObject()).toString();
  		  }catch(ClassNotFoundException e) {
  			  e.printStackTrace();
  		  }
		  ois.close();  
         }
          catch(FileNotFoundException e){
	      e.printStackTrace();
	     }catch( IOException e){
    	 e.printStackTrace();}
		return null;     
}
	
 }


	  


