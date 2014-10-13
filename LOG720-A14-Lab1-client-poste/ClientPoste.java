
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import ca.etsmtl.log720.lab1.BanqueDossiers;
import ca.etsmtl.log720.lab1.BanqueInfractions;
import ca.etsmtl.log720.lab1.CollectionDossier;
import ca.etsmtl.log720.lab1.CollectionInfraction;
import ca.etsmtl.log720.lab1.DossierHelper;
import ca.etsmtl.log720.lab1.Infraction;
import ca.etsmtl.log720.lab1.InfractionHelper;

public class ClientPoste implements BanqueDossiers, BanqueInfractions {
	
	static boolean dossierChoisi = false;
	static String[] arguments;
	static BanqueInfractions banqInfraction;
	static BanqueDossiers banqDossier;
	static org.omg.CORBA.ORB orb;
	
	public static void main(String[] args) {
		
		arguments = args;
		
		NamingContextExt nce = obtenirNameService();
		
		org.omg.CORBA.Object obj = nce.resolve(nce.to_name("infraction"))
		
		banqInfraction = InfractionHelper.narrow(nce.to_name("infraction"));			
		banqDossier = BanqueDossierHelper.narrow(nce.to_name("dossier"));
		
		ecrire("Client de la voiture");
		
		boolean termine = false;
		
		while(!termine)
		{
			ArrayList<String> liste = new ArrayList<String>();
			
			liste.add("Afficher la liste des dossiers");
			liste.add("Ajouter un dossier à la banque");
			liste.add("Afficher la liste des infractions");
			liste.add("Ajouter une infraction à la banque");
			liste.add("Terminer les opérations");
			
			int choix = choisir("Veuillez choisir une opération", liste);
			
			switch(choix)
			{
				case 0:
					afficherDossiers();
					break;
				case 1: 
					ajouterDossier();
					break;
				case 2:
					afficherInfractions();
					break;
				case 3:
					ajouterInfraction();
					break;
				case 4: 
					termine = true;
					ecrire("Terminé.");
					break;
			}
			
		}
		try{
			orb.shutdown(true);
			System.out.println("Le client a été fermé.");
		} catch (Exception e){
			e.printStackTrace();
		}
		

	}
	
	private static int choisir(String question, ArrayList<String> liste)
	{
		int num = 0;
			
		ecrire(question);
		
		int i = 0;
		
		for(String option : liste)
		{
			i++;
			ecrire(i + ": " + option);
		}
		
		num = demanderNombre();
		
		while( !(num > 0 && num <= liste.size()) )
		{
			ecrire("Entrée invalide. " + question);
			num = demanderNombre();
		}
		
		return num-1;
	}
	private static int demanderNombre()
	{
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	private static void ecrire(String texte)
	{
		ecrire(texte, true);
	}	
	private static void ecrire(String texte, boolean sautDeLigne)
	{
		if (sautDeLigne)
		{
			System.out.println(texte);
		}
		else
		{
			System.out.print(texte);
		}
	}
	
	/**
	 * Afficher les infractions dans la collection. 
	 **/
	private static void afficherInfractions()
	{
		
		System.out.println("Voici la liste des infractions /n /n");
		CollectionInfraction cInfrac = banqInfraction.infractions();
				
		for(int = 0; i < cInfrac.size(); i++){
			System.out.println(cInfrac.getInfraction(i)._toString());
			// Faire une petite pause avant d'afficher les autres infractions.
			Thread.sleep(2000);
		}
		
	}
	
	/**
	 * Afficher les dossiers dans la collection. 
	 **/
	private static void afficherDossiers()
	{
		System.out.println("Voici la liste des infractions /n /n");
		CollectionDossier cDoss = banqDossier.dossiers();
		
		for(int i = 0; i<cDoss.size(); i++){
			System.out.println(cDoss.getDossier(i)._toString());
			// Faire une petite pause avant d'afficher les autres infractions.
			Thread.sleep(2000);
		}
	}
	
	/**
	 * Ajout d'un nouveau dossier dans la banque de dossier
	 **/
	private static void ajouterDossier()
	{
		System.out.println("Veuillez, S.V.P, entrer les informations nécessaire au dossier ");
		
		System.out.println("Nom de famille : ");
		String nom = System.in.read();
		
		System.out.println("Prénom : ");
		String prenom = System.in.read();
		
		System.out.println("Numéro de plaque : ");
		String numPlaque = System.in.read();
		
		System.out.println("Numéro de permis de conduire : ");
		String numPermis = System.in.read();
		
		try{
			banqDossier.ajouterDossier(nom, prenom, noPermis, noPlaque);
		} catch(NoPermisExisteDejaException e){
			System.out.println("Le numéro de permis existe déjà.");
		}
	}
	
	private static void ajouterInfraction(BanqueInfractions banqInfrac)
	{
		
		System.out.println("Ajout d'un nouveau dossier.")
		System.out.println("Veuillez, S.V.P, saisir la description de l'infraction : ");
		String desc = System.in.read();
		
		System.out.println("Veuillez, S.V.P, saisir le niveau de l'infraction :");
		int niveau = Integer.parseInt(System.in.read());
		
		try{
			banqInfraction.ajouterInfraction(desc, niveau);
		}catch (NiveauHorsBornesException e){
			System.out.println("Le niveau est hors bornes.");
		}
	}

	
	private NamingContextExt obtenirNameService()
	{
		orb = org.omg.CORBA.ORB.init(arguments, null);

		NamingContextExt nc = null;
		
		// get hold of the naming service
		try {
			nc = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
		} catch (InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return nc;
	}
	
}
