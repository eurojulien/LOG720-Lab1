package src;
import java.util.ArrayList;

import ca.etsmtl.log720.lab1.*;

public class CollectionDossiersObject extends CollectionDossierPOA {

	private ArrayList<DossierObject> dossiers;
	
	
	// Methodes internes
	public CollectionDossiersObject(){
		dossiers = new ArrayList<DossierObject>();		
	}
	
	@Override
	public Dossier getDossier(int index) {
		
		try{
			return (Dossier) dossiers.get(index);
		}
		catch(Exception o){
			return null;
		}
	}
	
	public CollectionDossiersObject getDossiersAvecNom(String nom, String prenom){
		
		CollectionDossiersObject matchingColl = new CollectionDossiersObject();
		
		for (DossierObject dossier : dossiers){
			
			if (dossier.nom().contains(nom) &&
				dossier.prenom().contains(prenom)){
				
				matchingColl.addDossier((Dossier) dossier);
			}
		}
		
		return matchingColl;
	}
	
	public CollectionDossiersObject getDossiersAvecPlaque(String noPlaque){
		
		CollectionDossiersObject matchingColl = new CollectionDossiersObject();
		
		for (DossierObject dossier : dossiers){
			
			if (dossier.nom().contains(noPlaque)){
				
				matchingColl.addDossier((Dossier) dossier);
			}
		}
		
		return matchingColl;
	}
	
	public Dossier getDossierAvecPermis(String permis){
		
		for (DossierObject dossier : dossiers){
			
			if(dossier.noPermis().equals(permis)){
				return (Dossier) dossier;
			}
		}
		
		return null;
	}
	
	public Dossier getDossierAvecId(int id){
		return (Dossier) dossiers.get(id);
	}
	
	
	public void addDossier(Dossier dossier){
		dossiers.add((DossierObject) dossier);
	}
	
	public void addDossier(String nom, String prenom, String noPermis, String noPlaque) throws NoPermisExisteDejaException {
		
		if (getDossierAvecPermis(noPermis) != null){
			throw new NoPermisExisteDejaException();
		}
		
		dossiers.add(new DossierObject(nom, prenom, noPermis, noPlaque));
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.dossiers.size();
	}

}
