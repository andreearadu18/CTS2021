package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		// E.14 - template (avem un sablon pt pasi, pasii trebuie respectati strict)

		SpectatorAbstract spectator = new  Spectator("Cornel");
		SpectatorAbstract spectatorVIP = new SpectatorVIP("Andreea", "Loja 1");
		spectator.intrarePeStadion();
		spectatorVIP.intrarePeStadion();
	}

}
