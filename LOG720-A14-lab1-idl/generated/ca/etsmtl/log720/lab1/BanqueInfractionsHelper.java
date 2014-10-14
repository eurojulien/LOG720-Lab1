package ca.etsmtl.log720.lab1;


/**
 * Generated from IDL interface "BanqueInfractions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2014-09-22 11:36:52
 */

public final class BanqueInfractionsHelper
{
	public static void insert (final org.omg.CORBA.Any any, final ca.etsmtl.log720.lab1.BanqueInfractions s)
	{
			any.insert_Object(s);
	}
	public static ca.etsmtl.log720.lab1.BanqueInfractions extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:ca/etsmtl/log720/lab1/BanqueInfractions:1.0", "BanqueInfractions");
	}
	public static String id()
	{
		return "IDL:ca/etsmtl/log720/lab1/BanqueInfractions:1.0";
	}
	public static BanqueInfractions read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(ca.etsmtl.log720.lab1._BanqueInfractionsStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final ca.etsmtl.log720.lab1.BanqueInfractions s)
	{
		_out.write_Object(s);
	}
	public static ca.etsmtl.log720.lab1.BanqueInfractions narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof ca.etsmtl.log720.lab1.BanqueInfractions)
		{
			return (ca.etsmtl.log720.lab1.BanqueInfractions)obj;
		}
		else if (obj._is_a("IDL:ca/etsmtl/log720/lab1/BanqueInfractions:1.0"))
		{
			ca.etsmtl.log720.lab1._BanqueInfractionsStub stub;
			stub = new ca.etsmtl.log720.lab1._BanqueInfractionsStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static ca.etsmtl.log720.lab1.BanqueInfractions unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof ca.etsmtl.log720.lab1.BanqueInfractions)
		{
			return (ca.etsmtl.log720.lab1.BanqueInfractions)obj;
		}
		else
		{
			ca.etsmtl.log720.lab1._BanqueInfractionsStub stub;
			stub = new ca.etsmtl.log720.lab1._BanqueInfractionsStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
