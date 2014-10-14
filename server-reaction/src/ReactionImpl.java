package src;

import ca.etsmtl.log720.lab1.ReactionPOA;

public class ReactionImpl extends ReactionPOA {
	
	int id;
	String description;
	int niveau;
	
	public ReactionImpl(int id, String description, int niveau)
	{
		this.id = id;
		this.description = description;
		this.niveau = niveau;
	}

	public int id() {
		return id;
	}

	public String description() {
		return description;
	}

	public int niveau() {
		return niveau;
	}

	public String _toString() {
		return id + " - " + description + " - Gravite: " + niveau;
	}

}
