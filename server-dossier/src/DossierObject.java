package src;
import ca.etsmtl.log720.lab1.*;

public class DossierObject extends DossierPOA{
	
	private static final int MAX = 9;
	
	private static int idCounter = 1;
	private int id;
	private String nom;
	private String noPermis;
	private String noPlaque;
	private String prenom;
	private int niveau;
	private int[] listInfractions;
	private int[] listReactions;
	
	
	// Methodes internes
	public DossierObject(){	
		this.id 		= idCounter++;
		this.nom		= "";
		this.prenom		= "";
		this.noPermis	= "";
		this.noPlaque	= "";
		this.niveau		= 0;
		
		listInfractions = new int[MAX];
		listReactions	= new int[MAX];
	}
	
	// Constructeur parametrique
	public DossierObject(String nom, String prenom, String noPermis, String noPlaque){
		this.id			= idCounter++;
		this.nom		= nom;
		this.prenom		= prenom;
		this.noPermis	= noPermis;
		this.noPlaque	= noPlaque;
		this.niveau		= 0;
		
		listInfractions = new int[MAX];
		listReactions	= new int[MAX];
	}
	
	@Override
	public int id() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return this.nom;
	}

	@Override
	public String noPermis() {
		// TODO Auto-generated method stub
		return this.noPermis;
	}

	@Override
	public String noPlaque() {
		// TODO Auto-generated method stub
		return this.noPlaque;
	}

	@Override
	public String prenom() {
		// TODO Auto-generated method stub
		return this.prenom;
	}

	@Override
	public int niveau() {
		// TODO Auto-generated method stub
		return this.niveau;
	}

	@Override
	public int[] getListeInfraction() {
		// TODO Auto-generated method stub
		return this.listInfractions;
	}

	@Override
	public int[] getListeReaction() {
		// TODO Auto-generated method stub
		return this.listReactions;
	}

	@Override
	public void ajouterReactionAListe(int idReaction) {
		// TODO Auto-generated method stub
		
		for(int cpt = 0; cpt < MAX; cpt++){
			
			if(listReactions[cpt] == 0){
				listReactions[cpt] = idReaction;
				break;
			}
		}
		
	}

	@Override
	public void ajouterInfractionAListe(int idInfraction) {
		// TODO Auto-generated method stub
	
		for(int cpt = 0; cpt < MAX; cpt++){
			
			if(listInfractions[cpt] == 0){
				listInfractions[cpt] = idInfraction;
				break;
			}
		}
	}

	@Override
	public String _toString() {
		// TODO Auto-generated method stub
		return this.nom + " " + this.prenom;
	}

}
