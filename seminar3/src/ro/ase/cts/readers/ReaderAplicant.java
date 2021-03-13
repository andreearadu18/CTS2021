package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

abstract public class ReaderAplicant {
	protected String numeFisier;
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	public ReaderAplicant(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}

	public ReaderAplicant() {
		// TODO Auto-generated constructor stub
	}
	
	public void readAplicant(Scanner input2, Aplicant a) {
		
		String nume = input2.next();
		String prenume = input2.next();
		int varsta = input2.nextInt();
		int punctaj = input2.nextInt();
		int nr = input2.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input2.next();
		
		a.setNume(nume);
		a.setPrenume(prenume);
		a.setVarsta(varsta);
		a.setPunctaj(punctaj);
		a.setDenumiriProiecte(vect, nr);
		
	}
	
}
