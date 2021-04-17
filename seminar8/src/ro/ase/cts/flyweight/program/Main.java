package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		// B.10 - flyweight (gestionarea memoriei)
		
		Rezervare rezervare1 = new Rezervare(100,3,19);
		Rezervare rezervare2 = new Rezervare(102,5,21);
		Rezervare rezervare3 = new Rezervare(103,9,10);
		
		FabricaClienti fabrica = new FabricaClienti();
		Client client1 = fabrica.getClient("client1@client.com");
		client1.printeazaRezervare(rezervare1);
		fabrica.getClient("client2@test.com").printeazaRezervare(rezervare2);
		
		fabrica.getClient("client1@client.com").printeazaRezervare(rezervare3);
	}

}
