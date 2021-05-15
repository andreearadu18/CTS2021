package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		
		// E.12 Observer (relatie 1 la m)
		//observabil - subiectul, observer - clientii
		
		ManagerSala manager = new ManagerSala("Sala 1");
		ClientAbonat client1  = new ClientAbonat("Ana"); // nu respecta LISKOV
		ClientAbonat client2 = new ClientAbonat("Mara");
		ClientAbonat client3  = new ClientAbonat("Ion");

		manager.aboneaza(client1);
		manager.aboneaza(client2);
		manager.aboneaza(client3);
		
		manager.anuntaMeci("fotbal");
		manager.dezaboneaza(client3);
		manager.anuntaMeci("volei");

	}

}
