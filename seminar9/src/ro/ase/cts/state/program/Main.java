package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervata;

public class Main {

	public static void main(String[] args) {
		// B.13 - state

		Masa masa = new Masa(1);
		masa.rezervaMasa("Ana");
		masa.rezervaMasa("Gigel");
		masa.elibereazaMasa("Ana");
		
		Masa masa2 = new Masa(2);
		Rezervata rezervat = new Rezervata();
		Ocupata ocupata = new Ocupata();
		Libera libera = new Libera();
		
		libera.modificaStare(masa2);
		rezervat.modificaStare(masa2);
		ocupata.modificaStare(masa2);
		
	}

}
