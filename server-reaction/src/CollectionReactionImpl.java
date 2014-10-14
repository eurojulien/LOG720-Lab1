package src;

import java.util.ArrayList;

import ca.etsmtl.log720.lab1.CollectionReactionPOA;
import ca.etsmtl.log720.lab1.Reaction;

public class CollectionReactionImpl extends CollectionReactionPOA {

	ArrayList<ReactionImpl> liste;
	
	public int size() {
		return liste.size();
	}

	public Reaction getReaction(int index) {
		return (Reaction) liste.get(index);
	}
	
	public void ajouterReaction(String description, int niveau)
	{
		liste.add(new ReactionImpl(liste.size(), description, niveau));
	}
	
	public ReactionImpl trouverReactionParId(int idReaction) {
		for(ReactionImpl r : liste)
		{
			if (r.id() == idReaction)
			{
				return r;
			}
		}
		return null;
	}

}
