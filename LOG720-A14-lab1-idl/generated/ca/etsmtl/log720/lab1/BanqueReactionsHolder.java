package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "BanqueReactions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:37:01
 */

public final class BanqueReactionsHolder	implements org.omg.CORBA.portable.Streamable{
	 public BanqueReactions value;
	public BanqueReactionsHolder()
	{
	}
	public BanqueReactionsHolder (final BanqueReactions initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BanqueReactionsHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BanqueReactionsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BanqueReactionsHelper.write (_out,value);
	}
}
