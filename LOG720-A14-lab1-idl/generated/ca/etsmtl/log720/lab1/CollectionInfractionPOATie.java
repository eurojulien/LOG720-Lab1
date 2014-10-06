package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CollectionInfraction".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:52
 */

public class CollectionInfractionPOATie
	extends CollectionInfractionPOA
{
	private CollectionInfractionOperations _delegate;

	private POA _poa;
	public CollectionInfractionPOATie(CollectionInfractionOperations delegate)
	{
		_delegate = delegate;
	}
	public CollectionInfractionPOATie(CollectionInfractionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.CollectionInfraction _this()
	{
		return ca.etsmtl.log720.lab1.CollectionInfractionHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.CollectionInfraction _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.CollectionInfractionHelper.narrow(_this_object(orb));
	}
	public CollectionInfractionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CollectionInfractionOperations delegate)
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
	public ca.etsmtl.log720.lab1.Infraction getInfraction(int index)
	{
		return _delegate.getInfraction(index);
	}

	public int size()
	{
		return _delegate.size();
	}

}
