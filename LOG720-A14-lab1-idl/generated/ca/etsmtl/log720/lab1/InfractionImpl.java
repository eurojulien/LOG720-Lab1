package ca.etsmtl.log720.lab1;

public class InfractionImpl extends InfractionPOA {

	private int _id;
	private String _description;
	private int _niveau;
	
	public InfractionImpl(int id, String description, int niveau){
		this._id = id;
		this._description = description;
		this._niveau = niveau;
	}
	@Override
	public int id() {
		// TODO Auto-generated method stub
		return this._id;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return this._description;
	}

	@Override
	public int niveau() {
		// TODO Auto-generated method stub
		return this._niveau;
	}

	@Override
	public String _toString() {
		// TODO Auto-generated method stub
		return "Infraction /n" 
				+ " Id : " + _id  + "/n" 
				+ " Niveau : " + _niveau + "/n"
				+ " Description : " + this._description;
	}

}
