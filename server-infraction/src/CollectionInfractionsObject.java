package src;

import java.util.ArrayList;

import ca.etsmtl.log720.lab1.*;

public class CollectionInfractionsObject extends CollectionInfractionPOA {

	private ArrayList<InfractionObject> infractions;
	
	public void add(Infraction infraction){
		this.infractions.add((InfractionObject) infraction);
	}
	
	public void add(int niveau, String description){
		this.infractions.add( new InfractionObject(
								niveau,
								description
							));
	}
	
	@Override
	public Infraction getInfraction(int index) {
		
		Infraction infraction;
		try{
			infraction = (Infraction) infractions.get(index);
		}
		
		catch(Exception e){
			return null;
		}
		
		return infraction;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return infractions.size();
	}

}
