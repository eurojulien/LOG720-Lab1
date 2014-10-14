package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "Infraction".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:52
 */

public final class InfractionHolder	implements org.omg.CORBA.portable.Streamable{
	 public Infraction value;
	public InfractionHolder()
	{
	}
	public InfractionHolder (final Infraction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return InfractionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InfractionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		InfractionHelper.write (_out,value);
	}
}
