package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL interface "Dossier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public final class DossierHolder	implements org.omg.CORBA.portable.Streamable{
	 public Dossier value;
	public DossierHolder()
	{
	}
	public DossierHolder (final Dossier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DossierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DossierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DossierHelper.write (_out,value);
	}
}
