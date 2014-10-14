package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "BanqueDossiers".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public final class BanqueDossiersHolder	implements org.omg.CORBA.portable.Streamable{
	 public BanqueDossiers value;
	public BanqueDossiersHolder()
	{
	}
	public BanqueDossiersHolder (final BanqueDossiers initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BanqueDossiersHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BanqueDossiersHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BanqueDossiersHelper.write (_out,value);
	}
}
