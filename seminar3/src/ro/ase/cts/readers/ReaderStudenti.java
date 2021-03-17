package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class ReaderStudenti extends ReaderAplicanti{
	public ReaderStudenti(String numeFisier) {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.numeFisier));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student stud = new Student();
			super.readAplicant(input, stud);
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			stud.setAn_studii(an_studii);
			stud.setFacultate(facultate);
			studenti.add(stud);
		}
		input.close();
		return studenti;
	}
}
