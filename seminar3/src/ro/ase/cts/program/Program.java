package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.ReaderAngajati;
import ro.ase.cts.readers.ReaderAplicant;
import ro.ase.cts.readers.ReaderStudent;


public class Program {

	public static List<Aplicant> citireAplicanti(String numeFisier, ReaderAplicant reader) throws FileNotFoundException{
		return reader.readAplicanti(numeFisier);
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti("studenti.txt", new ReaderStudent());
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
