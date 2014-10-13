package src;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;

import ca.etsmtl.log720.lab1.*;

public class InfractionObject extends InfractionPOA {

	private static int m_infractionCounter = 1;
	
	private int infractionId;
	private int niveau;
	private String description;
	
	public InfractionObject(){
		
		this.infractionId 	= m_infractionCounter++;
		this.niveau 			= 0;
		this.description		= "";
	}
	
	public InfractionObject(int niveau, String description){
		
		this.infractionId	= m_infractionCounter++;
		this.niveau			= niveau;
		this.description	= description;
	}
	
	@Override
	public int id() {
		// TODO Auto-generated method stub
		return this.infractionId;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public int niveau() {
		// TODO Auto-generated method stub
		return this.niveau;
	}

	@Override
	public String _toString() {
		// TODO Auto-generated method stub
		return this.niveau + " : " + this.description;
	}

}
