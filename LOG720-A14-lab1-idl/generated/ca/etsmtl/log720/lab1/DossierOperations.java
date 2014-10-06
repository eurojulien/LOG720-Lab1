package ca.etsmtl.log720.lab1;


/**
 * Generated from IDL interface "Dossier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public interface DossierOperations
{
	/* constants */
	/* operations  */
	int id();
	java.lang.String nom();
	java.lang.String noPermis();
	java.lang.String noPlaque();
	java.lang.String prenom();
	int niveau();
	int[] getListeInfraction();
	int[] getListeReaction();
	void ajouterReactionAListe(int idReaction);
	void ajouterInfractionAListe(int idInfraction);
	java.lang.String _toString();
}
