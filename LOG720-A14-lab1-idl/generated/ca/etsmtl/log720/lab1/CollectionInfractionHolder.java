package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "CollectionInfraction".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:52
 */

public final class CollectionInfractionHolder	implements org.omg.CORBA.portable.Streamable{
	 public CollectionInfraction value;
	public CollectionInfractionHolder()
	{
	}
	public CollectionInfractionHolder (final CollectionInfraction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionInfractionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionInfractionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionInfractionHelper.write (_out,value);
	}
}
