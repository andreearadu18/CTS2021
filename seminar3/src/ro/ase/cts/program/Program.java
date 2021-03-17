package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.readers.ReaderAngajati;
import ro.ase.cts.readers.ReaderAplicanti;
import ro.ase.cts.readers.ReaderStudenti;

public class Program {

	public static List<Aplicant> citireAplicanti(ReaderAplicanti reader) throws FileNotFoundException {
		return reader.readAplicanti();
	}

	public static void main(String[] args) {
		
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti(new ReaderStudenti("studenti.txt"));
			Proiect proiect = new Proiect(82);
			
			for(Aplicant aplicant:listaAplicanti) {
				
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());
				aplicant.afisareRaspunsProiect(proiect);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
