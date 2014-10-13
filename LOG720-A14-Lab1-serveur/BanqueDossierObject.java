package src;
import ca.etsmtl.log720.lab1.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BanqueDossierObject extends BanqueDossiersPOA implements Serializable {

	private CollectionDossiersObject coll;
	
	public BanqueDossierObject(){
		coll = new CollectionDossiersObject();
	}
	
	@Override
	public CollectionDossier dossiers() {
		// TODO Auto-generated method stub
		return (CollectionDossier) coll;
	}

	@Override
	public CollectionDossier trouverDossiersParPlaque(String plaque) {
		// TODO Auto-generated method stub
		return (CollectionDossier) coll.getDossiersAvecPlaque(plaque);
	}

	@Override
	public CollectionDossier trouverDossiersParNom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return (CollectionDossier) coll.getDossiersAvecNom(nom, prenom);
	}

	@Override
	public Dossier trouverDossierParPermis(String noPermis) {
		// TODO Auto-generated method stub
		return coll.getDossierAvecPermis(noPermis);
	}

	@Override
	public Dossier trouverDossierParId(int idDossier) {
		// TODO Auto-generated method stub
		return coll.getDossier(idDossier);
	}

	@Override
	public void ajouterDossier(String nom, String prenom, String noPermis, String noPlaque) throws NoPermisExisteDejaException {
		// TODO Auto-generated method stub
		coll.addDossier(nom, prenom, noPermis, noPlaque);
	}

	@Override
	public void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws InvalidIdException {
		
		try{
			coll.getDossier(idDossier).ajouterInfractionAListe(idInfraction);
		}
		
		catch(Exception e){
			throw new InvalidIdException();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterReactionAuDossier(int idDossier, int idReaction) throws InvalidIdException {
		// TODO Auto-generated method stub
		try{
			coll.getDossier(idDossier).ajouterReactionAListe(idReaction);
		}
		
		catch(Exception o){
			throw new InvalidIdException();
		}
	}
	
	// Serialisation
	public void Serialize(){
		
		try{
			FileOutputStream fileOut 	= new FileOutputStream("/objser.ser");
			ObjectOutputStream out 		= new ObjectOutputStream(fileOut);
			
			out.writeObject(this);
			out.close();
			fileOut.close();
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	// Desialisation
	public BanqueDossierObject DeSerialize(String fileName){
		
		BanqueDossierObject obj;
		
		if (fileName.isEmpty()){
			fileName = "/objser.ser";
		}
		
		try
	      {
	         FileInputStream fileIn = new FileInputStream(fileName);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         obj = (BanqueDossierObject) in.readObject();
	         in.close();
	         fileIn.close();
	         
	      }catch(IOException | ClassNotFoundException i)
	      {
	         i.printStackTrace();
	         return null;
	      }
		
		return obj;
	}

}
