
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class ClientPoste {
	
	static boolean dossierChoisi = false;
	static String[] arguments;

	public static void main(String[] args) {
		
		arguments = args;
		
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
	
	private static void afficherInfractions()
	{
		
	}

	private static void afficherDossiers()
	{
		
	}
	
	private static void ajouterDossier()
	{
		
	}
	
	private static void ajouterInfraction()
	{
		
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
