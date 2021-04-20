package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;

public class Main {

	public static void main(String[] args) {
		// B.9 - proxy
		
		OperatorRezervare operator = new OperatorRezervare("Linea");
		operator.rezerva(2);
		
		ProxyRezervare proxyRezervare = new ProxyRezervare(operator, 4);
		proxyRezervare.rezerva(2);
		proxyRezervare.rezerva(6);
	
	}

}
