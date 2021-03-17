package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

abstract public class ReaderAplicanti {
	protected String numeFisier;
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	public ReaderAplicanti(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}

	public ReaderAplicanti() {
		// TODO Auto-generated constructor stub
	}
	
	public void readAplicant(Scanner input, Aplicant a) {
		
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		
		a.setNume(nume);
		a.setPrenume(prenume);
		a.setVarsta(varsta);
		a.setPunctaj(punctaj);
		a.setDenumiriProiecte(vect, nr);
		
	}
	
}
