package ca.etsmtl.log720.lab1;


/**
 * Generated from IDL interface "BanqueInfractions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:52
 */

public interface BanqueInfractionsOperations
{
	/* constants */
	/* operations  */
	ca.etsmtl.log720.lab1.CollectionInfraction infractions();
	ca.etsmtl.log720.lab1.CollectionInfraction trouverInfractionsParDossier(ca.etsmtl.log720.lab1.Dossier mydossier);
	ca.etsmtl.log720.lab1.Infraction trouverInfractionParId(int idInfraction);
	void ajouterInfraction(java.lang.String description, int niveau) throws ca.etsmtl.log720.lab1.NiveauHorsBornesException;
}
