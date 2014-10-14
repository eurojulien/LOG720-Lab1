package ca.etsmtl.log720.lab1;


/**
 * Generated from IDL interface "BanqueReactions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:37:01
 */

public interface BanqueReactionsOperations
{
	/* constants */
	/* operations  */
	ca.etsmtl.log720.lab1.CollectionReaction reactions();
	void ajouterReaction(java.lang.String reaction, int gravite);
	ca.etsmtl.log720.lab1.CollectionReaction trouverReactionsParDossier(ca.etsmtl.log720.lab1.Dossier myDossier);
	ca.etsmtl.log720.lab1.Reaction trouverReactionParId(int idReaction);
}
