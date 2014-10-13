package src;
import java.io.*;

import org.omg.CosNaming.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		org.omg.CORBA.ORB objectRelationBroker = org.omg.CORBA.ORB.init(args, null);
		
		try{
			org.omg.PortableServer.POA portableObjectAdapter =
					org.omg.PortableServer.POAHelper.narrow(
							objectRelationBroker.resolve_initial_references("RootPOA"));
			
		
			portableObjectAdapter.the_POAManager().activate();
		
			org.omg.CORBA.Object obj = portableObjectAdapter.
									 servant_to_reference(new BanqueDossierObject());
		
			if (args.length == 1){
				
				// Write the object reference to args[0]
				PrintWriter ps = new PrintWriter(
									new FileOutputStream(
											new File(args[0])));
				
				ps.println(objectRelationBroker.object_to_string(obj));
				ps.close();
			}
			
			else{
				
				// Register with the naming service
				NamingContextExt nc =
						NamingContextExtHelper.narrow(
								objectRelationBroker.resolve_initial_references("NameService"));
				
				nc.bind(nc.to_name("BanqueReactions"), obj);
			}
		
		}
		catch(Exception e){
		
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		objectRelationBroker.run();
	}

}
