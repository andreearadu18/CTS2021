package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCash;


public class Main {

	public static void main(String[] args) {
		// B.11 - strategy
		
		Client client1 = new Client("Ionel", new PlataCash());
		client1.platesteNota(20);
		client1.setModPlata(new PlataCash());
		client1.platesteNota(5);
	
	}

}
