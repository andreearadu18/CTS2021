package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		//D.16 Banca - Command
		
		ManagerComenzi comenzi = new ManagerComenzi();
		ContBancar cont = new ContBancar("Andreea");
		
		comenzi.invocaComanda(new ComandaConstituire(cont, 100));
		comenzi.invocaComanda(new ComandaDepunere(cont, 100));
		comenzi.executaComanda();
		comenzi.invocaComanda(new ComandaRetragere(cont, 150));
		comenzi.executaComanda();
		comenzi.executaComanda();
		comenzi.invocaComanda(new ComandaRetragere(cont, 50));
		comenzi.executaComanda();
	}

}
