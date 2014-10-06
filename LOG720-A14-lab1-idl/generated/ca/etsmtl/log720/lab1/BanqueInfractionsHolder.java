package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "BanqueInfractions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:52
 */

public final class BanqueInfractionsHolder	implements org.omg.CORBA.portable.Streamable{
	 public BanqueInfractions value;
	public BanqueInfractionsHolder()
	{
	}
	public BanqueInfractionsHolder (final BanqueInfractions initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BanqueInfractionsHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BanqueInfractionsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BanqueInfractionsHelper.write (_out,value);
	}
}
