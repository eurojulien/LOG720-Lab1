package ca.etsmtl.log720.lab1;

/**
 * Generated from IDL alias "ListeReaction".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public final class ListeReactionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ListeReactionHolder ()
	{
	}
	public ListeReactionHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ListeReactionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ListeReactionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ListeReactionHelper.write (out,value);
	}
}
