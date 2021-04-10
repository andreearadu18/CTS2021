package ro.ase.cts.adapter.program;

import java.rmi.dgc.Lease;

import ro.ase.cts.adapter.clase.AdapterCredit;
import ro.ase.cts.adapter.clase.AdapterCrediteClasa;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {
	
	public static void creeazaCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		//D.5 - Adapter
		Leasing leasing = new Leasing(1000, "Andreea");
		AdapterCredit adapter = new AdapterCredit(leasing);
		creeazaCredit(adapter);
		//CreditAbstract ca = new AdapterCrediteClasa(6000, "Ana");
		AdapterCrediteClasa adapterClasa = new AdapterCrediteClasa(6000, "Ana");
		creeazaCredit(adapterClasa);
		
		
		

	}
	
}
