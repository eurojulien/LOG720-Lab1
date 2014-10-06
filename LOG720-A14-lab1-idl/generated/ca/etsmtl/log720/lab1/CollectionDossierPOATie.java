package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CollectionDossier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public class CollectionDossierPOATie
	extends CollectionDossierPOA
{
	private CollectionDossierOperations _delegate;

	private POA _poa;
	public CollectionDossierPOATie(CollectionDossierOperations delegate)
	{
		_delegate = delegate;
	}
	public CollectionDossierPOATie(CollectionDossierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.CollectionDossier _this()
	{
		return ca.etsmtl.log720.lab1.CollectionDossierHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.CollectionDossier _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.CollectionDossierHelper.narrow(_this_object(orb));
	}
	public CollectionDossierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CollectionDossierOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public ca.etsmtl.log720.lab1.Dossier getDossier(int index)
	{
		return _delegate.getDossier(index);
	}

	public int size()
	{
		return _delegate.size();
	}

}
