package src;
import ca.etsmtl.log720.lab1.BanqueReactionsPOA;
import ca.etsmtl.log720.lab1.CollectionReaction;
import ca.etsmtl.log720.lab1.Dossier;
import ca.etsmtl.log720.lab1.Reaction;

public class BanqueReactionImpl extends BanqueReactionsPOA {

	CollectionReactionImpl collection = new CollectionReactionImpl();
	
	public CollectionReaction reactions() {
		return (CollectionReaction)collection;
	}

	public void ajouterReaction(String reaction, int gravite) {
		collection.ajouterReaction(reaction, gravite);
	}

	public CollectionReaction trouverReactionsParDossier(Dossier myDossier) {
		int[] idReactions = myDossier.getListeReaction();

		CollectionReactionImpl collectionParDossier = new CollectionReactionImpl();
		
		for(int id : idReactions)
		{
			Reaction reactionAAjouter = trouverReactionParId(id);
			collectionParDossier.ajouterReaction(reactionAAjouter.description(), reactionAAjouter.id());
		}
		return (CollectionReaction)collectionParDossier;
	}

	public Reaction trouverReactionParId(int idReaction) {
		return (Reaction)collection.trouverReactionParId(idReaction);
	}

}
