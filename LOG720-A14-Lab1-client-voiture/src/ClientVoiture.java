package src;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class ClientVoiture {
	
	static boolean dossierChoisi = false;
	static String[] arguments;

	public static void main(String[] args) {
		
		arguments = args;
		
		ecrire("Client de la voiture");
		
		boolean termine = false;
		
		while(!termine)
		{
			ArrayList<String> liste = new ArrayList<String>();
			
			liste.add("Afficher la liste des réactions");
			liste.add("Afficher la liste des infractions possibles");
			liste.add("Afficher la liste des dossiers");
			liste.add("Ajouter une réaction à la banque de réactions");
			
			if(dossierChoisi)
			{
				choixDossierActif(liste);
			}
			else
			{
				choixSansDossier(liste);
			}
		}

	}

	private static boolean choixDossierActif(ArrayList<String> liste)
	{
		ecrire("Dossier actif: A123 - Fake McNotReal");
		
		liste.add("Ajouter une réaction au dossier");
		liste.add("Ajouter une infraction au dossier");
		liste.add("Quitter le dossier");
		ecrire("---");
		liste.add("Terminer les opérations");
		
		int choix = choisir("Veuillez choisir une opération", liste);
		
		switch(choix)
		{
			case 0:
				afficherReactions();
				break;
			case 1: 
				afficherInfractions();
				break;
			case 2:
				afficherDossiers();
				break;
			case 3:
				ajouterReactionABanque();
				break;
			case 4: 
				ajouterReactionDossier();
				break;
			case 5:
				ajouterInfractionDossier();
				break;
			case 6:
				quitterDossier();
				break;
			case 7:
				ecrire("Terminé.");
				return true;
		}
		
		return false;
	}
	
	private static boolean choixSansDossier(ArrayList<String> liste)
	{

		liste.add("Accéder à un dossier");
		liste.add("Terminer les opérations");
		
		int choix = choisir("Veuillez choisir une opération", liste);
		
		switch(choix)
		{
			case 0:
				afficherReactions();
				break;
			case 1: 
				afficherInfractions();
				break;
			case 2:
				afficherDossiers();
				break;
			case 3:
				ajouterReactionABanque();
				break;
			case 4: 
				accederDossier();
				break;
			case 5:
				ecrire("Terminé.");
				return true;
		}
		
		return false;
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
	
	private static void afficherReactions()
	{
		
	}
	
	private static void afficherInfractions()
	{
		
	}

	private static void afficherDossiers()
	{
		
	}
	
	private static void ajouterReactionABanque()
	{
		
	}
	
	private static void ajouterReactionDossier()
	{
		
	}
	
	private static void ajouterInfractionDossier()
	{
		
	}
	
	private static void quitterDossier()
	{
		dossierChoisi = false;
	}
	
	private static void accederDossier()
	{
		dossierChoisi = true;
	}
	
	private NamingContextExt obtenirNameService()
	{
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(arguments, null);

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
