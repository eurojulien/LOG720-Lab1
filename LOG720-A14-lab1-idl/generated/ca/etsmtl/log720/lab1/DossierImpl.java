package ca.etsmtl.log720.lab1;

public class DossierImpl extends DossierPOA {
 
	private int _id;
	private String _nom;
	private String _noPermis;
	private String _noPlaque;
	private String _prenom;
	private int _niveau;
	private int[] _infracList;
	private int[] _reacList;
	private int intRect = 0;
	private int intInfrac = 0;
	
	
	@Override
	public int id() {
		// TODO Auto-generated method stub
		return this._id;
	}

	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return this._nom;
	}

	@Override
	public String noPermis() {
		// TODO Auto-generated method stub
		return this._noPermis;
	}

	@Override
	public String noPlaque() {
		// TODO Auto-generated method stub
		return this._noPlaque;
	}

	@Override
	public String prenom() {
		// TODO Auto-generated method stub
		return this._prenom;
	}

	@Override
	public int niveau() {
		// TODO Auto-generated method stub
		return this._niveau;
	}

	@Override
	public int[] getListeInfraction() {
		// TODO Auto-generated method stub
		return this._infracList;
	}

	@Override
	public int[] getListeReaction() {
		// TODO Auto-generated method stub
		return this._reacList;
	}

	@Override
	public void ajouterReactionAListe(int idReaction) {
		// TODO Auto-generated method stub
		_reacList[intRect] = idReaction;
		intRect++;
	}

	@Override
	public void ajouterInfractionAListe(int idInfraction) {
		// TODO Auto-generated method stub
		_infracList[intInfrac] = idInfraction;
		intInfrac++;
	}

	@Override
	public String _toString() {
		// TODO Auto-generated method stub
		String strInfos = "Dossier /n"
							+ " ID : " + this._id
							+ "/n Nom : " + this._nom
							+ "/n Prénom : " + this._prenom
							+ "/n Niveau : " + this._niveau;
		return strInfos;
	}

}
