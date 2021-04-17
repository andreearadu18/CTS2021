package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
	
	//flyweight factory
	
	private Map<String, Client> clienti;

	public FabricaClienti() {
		this.clienti = new HashMap<String, Client>();
	}
	
	public Client getClient(String email) {
		if(clienti.containsKey(email)) {
			return clienti.get(email);
		}else {
			//ne construim un client nou pt ca nu il avem in memorie
			Client client = new Client("John", 123456, email);
			clienti.put(email,client);
			return client;
		}
	}
	
}
