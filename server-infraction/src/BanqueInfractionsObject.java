package src;

import ca.etsmtl.log720.lab1.*;

public class BanqueInfractionsObject extends BanqueInfractionsPOA{

	CollectionInfractionsObject coll;
	
	@Override
	public CollectionInfraction infractions() {
		// TODO Auto-generated method stub
		return (CollectionInfraction) coll;
	}

	@Override
	public CollectionInfraction trouverInfractionsParDossier(Dossier mydossier) {
		
		CollectionInfractionsObject dossierColl = new CollectionInfractionsObject();
		
		for(int infractionId : mydossier.getListeInfraction()){
			dossierColl.add(coll.getInfraction(infractionId));
		}
		
		// TODO Auto-generated method stub
		return (CollectionInfraction) dossierColl;
	}

	@Override
	public Infraction trouverInfractionParId(int idInfraction) {
		// TODO Auto-generated method stub
		return coll.getInfraction(idInfraction);
	}

	@Override
	public void ajouterInfraction(String description, int niveau) throws NiveauHorsBornesException {
		
		try{
			coll.add(niveau, description);
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
