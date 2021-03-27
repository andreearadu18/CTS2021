package ro.cts.ase.prototype.program;

import ro.cts.ase.prototype.clase.AbstractPrototype;
import ro.cts.ase.prototype.clase.Bilet;
import ro.cts.ase.prototype.clase.ClientStadion;

public class Main {

	public static void main(String[] args) {
		// E.4
		AbstractPrototype abstractPrototype = (AbstractPrototype) new ClientStadion("Andreea", 21);
		AbstractPrototype abstractPrototype1 = abstractPrototype.copiaza();
		ClientStadion clientStadion = (ClientStadion) abstractPrototype.copiaza();
		clientStadion.setDenumire("denumire noua");
		
		System.out.println(abstractPrototype.toString());
		System.out.println(abstractPrototype1.toString());
		System.out.println(clientStadion.toString());
		
		Bilet bilet = new Bilet(1,"e1", "e2", "1 aprilie, 15:00");
		Bilet bilet2 = (Bilet) bilet.copiaza();
		bilet2.setCod(12);
		
		System.out.println(bilet.toString());
		System.out.println(bilet2.toString());
	}

}
