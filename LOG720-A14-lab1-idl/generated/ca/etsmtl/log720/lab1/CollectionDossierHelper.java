package ca.etsmtl.log720.lab1;


/**
 * Generated from IDL interface "CollectionDossier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public final class CollectionDossierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final ca.etsmtl.log720.lab1.CollectionDossier s)
	{
			any.insert_Object(s);
	}
	public static ca.etsmtl.log720.lab1.CollectionDossier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:ca/etsmtl/log720/lab1/CollectionDossier:1.0", "CollectionDossier");
	}
	public static String id()
	{
		return "IDL:ca/etsmtl/log720/lab1/CollectionDossier:1.0";
	}
	public static CollectionDossier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(ca.etsmtl.log720.lab1._CollectionDossierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final ca.etsmtl.log720.lab1.CollectionDossier s)
	{
		_out.write_Object(s);
	}
	public static ca.etsmtl.log720.lab1.CollectionDossier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof ca.etsmtl.log720.lab1.CollectionDossier)
		{
			return (ca.etsmtl.log720.lab1.CollectionDossier)obj;
		}
		else if (obj._is_a("IDL:ca/etsmtl/log720/lab1/CollectionDossier:1.0"))
		{
			ca.etsmtl.log720.lab1._CollectionDossierStub stub;
			stub = new ca.etsmtl.log720.lab1._CollectionDossierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static ca.etsmtl.log720.lab1.CollectionDossier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof ca.etsmtl.log720.lab1.CollectionDossier)
		{
			return (ca.etsmtl.log720.lab1.CollectionDossier)obj;
		}
		else
		{
			ca.etsmtl.log720.lab1._CollectionDossierStub stub;
			stub = new ca.etsmtl.log720.lab1._CollectionDossierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
