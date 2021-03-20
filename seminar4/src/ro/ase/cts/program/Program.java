package ro.ase.cts.program;

import ro.ase.cts.singletone.AsigurareMedicala;

public class Program {

	public static void main(String[] args) {
		
		AsigurareMedicala asigurareMedicala = AsigurareMedicala.getInstance();
		asigurareMedicala.setContributie(205.35f);
		
		AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();
		asigurareMedicala2.setId(2);
		
		System.out.println(asigurareMedicala.toString());
		System.out.println(asigurareMedicala2.toString());
		
		
		ro.ase.cts.singletonlazy.AsigurareMedicala asigurareMedicalaLazy = ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(3,"Andreea", 500.6f);
		ro.ase.cts.singletonlazy.AsigurareMedicala asigurareMedicalaLazy2 = ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(4,"Andreea", 800.6f);
		System.out.println(asigurareMedicalaLazy.toString());
		System.out.println(asigurareMedicalaLazy2.toString());
	}

}
