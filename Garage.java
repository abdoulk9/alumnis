package com.tp1.garage;
import com.tp1.garage.Vehicule;
import java.util.ArrayList;
import java.util.List;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Garage {
	
	 private String  fileName;
	 private  List<Vehicule> vehicule;
	
	//Declaration des objets en dehors du bloc try/catch
    ObjectInputStream ois = null;
    ObjectOutputStream oos = null;
    
 public Garage() {
        this.vehicule= new ArrayList<Vehicule>(); 
        this.fileName = "garage.txt";
        }
    
 public void addVoiture(Vehicule voiture) {  
    	try {
    	  oos = new ObjectOutputStream(
    			new BufferedOutputStream(
    			new FileOutputStream(
                new File(fileName))));
    	   vehicule.add(voiture);
    	   oos.writeObject(vehicule); 
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
  	               new File(fileName))));
  		      try {
		           System.out.println("***************************");
		           System.out.println("*  Garage OpenClassrooms  *");
		           System.out.println("***************************\n");
		           for (Vehicule v : vehicule)
			       System.out.println((ois.readObject().toString()));
		           
		        	} catch (EOFException e)
		        	{
		        		ois.close(); // ferme le fichier dans ce cas
		        	}
		        
  		          }catch(ClassNotFoundException e) {
  			       e.printStackTrace();
  		           }
    	
            catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		   } catch (IOException e1) {
			        // TOD;close();O Auto-generated catch block
			 e1.printStackTrace();
			 } return " ";
  }
}
    



	  


