package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "Reaction".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:37:01
 */

public final class ReactionHolder	implements org.omg.CORBA.portable.Streamable{
	 public Reaction value;
	public ReactionHolder()
	{
	}
	public ReactionHolder (final Reaction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ReactionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReactionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ReactionHelper.write (_out,value);
	}
}
