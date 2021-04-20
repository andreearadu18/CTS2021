package ro.ase.cts.strategy.clase;

public class Client {
	private String nume;
	private IModPlata modPlata;
	
	public Client(String nume, IModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}

	public void setModPlata(IModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public void platesteNota(int suma) {
		System.out.println(nume + " a primit nota de plata in valoare de " + suma);
		modPlata.plateste(suma);
	}
}
