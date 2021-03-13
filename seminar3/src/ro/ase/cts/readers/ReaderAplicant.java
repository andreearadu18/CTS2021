package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public interface ReaderAplicant {
	List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
}
