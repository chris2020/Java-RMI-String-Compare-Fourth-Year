package ie.gmit.sw;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servant {

	public static void main(String[] args) throws Exception{
		
		//Create an instance of a StringService. As StringServiceImpl implements the StringService
		//interface, it can be referred to as a StringService type.
		StringService ss = new StringServiceImpl();
		
		//Start the RMI regstry on port 1099
		LocateRegistry.createRegistry(1099);
		
		//Bind remote object to the registry with the human-readable name "compareStrings"
		Naming.rebind("compareStrings", ss);
		
	}// End main

}// End Servant
