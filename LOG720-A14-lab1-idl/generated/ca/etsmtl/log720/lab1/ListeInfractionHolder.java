package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL alias "ListeInfraction".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public final class ListeInfractionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ListeInfractionHolder ()
	{
	}
	public ListeInfractionHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ListeInfractionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ListeInfractionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ListeInfractionHelper.write (out,value);
	}
}
