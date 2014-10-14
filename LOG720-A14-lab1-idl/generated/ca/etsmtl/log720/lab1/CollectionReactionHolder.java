package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "CollectionReaction".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:37:01
 */

public final class CollectionReactionHolder	implements org.omg.CORBA.portable.Streamable{
	 public CollectionReaction value;
	public CollectionReactionHolder()
	{
	}
	public CollectionReactionHolder (final CollectionReaction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionReactionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionReactionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionReactionHelper.write (_out,value);
	}
}
