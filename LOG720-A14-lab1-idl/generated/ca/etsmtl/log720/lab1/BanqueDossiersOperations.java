package ca.etsmtl.log720.lab1;


/**
 * Generated from IDL interface "BanqueDossiers".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public interface BanqueDossiersOperations
{
	/* constants */
	/* operations  */
	ca.etsmtl.log720.lab1.CollectionDossier dossiers();
	ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParPlaque(java.lang.String plaque);
	ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParNom(java.lang.String nom, java.lang.String prenom);
	ca.etsmtl.log720.lab1.Dossier trouverDossierParPermis(java.lang.String noPermis);
	ca.etsmtl.log720.lab1.Dossier trouverDossierParId(int idDossier);
	void ajouterDossier(java.lang.String nom, java.lang.String prenom, java.lang.String noPermis, java.lang.String noPlaque) throws ca.etsmtl.log720.lab1.NoPermisExisteDejaException;
	void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws ca.etsmtl.log720.lab1.InvalidIdException;
	void ajouterReactionAuDossier(int idDossier, int idReaction) throws ca.etsmtl.log720.lab1.InvalidIdException;
}
