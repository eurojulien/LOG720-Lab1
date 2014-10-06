package ca.etsmtl.log720.lab1;


/**
 * Generated from IDL interface "BanqueDossiers".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:26
 */

public final class BanqueDossiersHelper
{
	public static void insert (final org.omg.CORBA.Any any, final ca.etsmtl.log720.lab1.BanqueDossiers s)
	{
			any.insert_Object(s);
	}
	public static ca.etsmtl.log720.lab1.BanqueDossiers extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:ca/etsmtl/log720/lab1/BanqueDossiers:1.0", "BanqueDossiers");
	}
	public static String id()
	{
		return "IDL:ca/etsmtl/log720/lab1/BanqueDossiers:1.0";
	}
	public static BanqueDossiers read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(ca.etsmtl.log720.lab1._BanqueDossiersStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final ca.etsmtl.log720.lab1.BanqueDossiers s)
	{
		_out.write_Object(s);
	}
	public static ca.etsmtl.log720.lab1.BanqueDossiers narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof ca.etsmtl.log720.lab1.BanqueDossiers)
		{
			return (ca.etsmtl.log720.lab1.BanqueDossiers)obj;
		}
		else if (obj._is_a("IDL:ca/etsmtl/log720/lab1/BanqueDossiers:1.0"))
		{
			ca.etsmtl.log720.lab1._BanqueDossiersStub stub;
			stub = new ca.etsmtl.log720.lab1._BanqueDossiersStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static ca.etsmtl.log720.lab1.BanqueDossiers unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof ca.etsmtl.log720.lab1.BanqueDossiers)
		{
			return (ca.etsmtl.log720.lab1.BanqueDossiers)obj;
		}
		else
		{
			ca.etsmtl.log720.lab1._BanqueDossiersStub stub;
			stub = new ca.etsmtl.log720.lab1._BanqueDossiersStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
