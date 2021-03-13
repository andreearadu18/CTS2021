package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

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
	
	
	
}
