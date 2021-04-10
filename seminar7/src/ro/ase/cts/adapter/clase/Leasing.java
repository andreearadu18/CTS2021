package ro.ase.cts.adapter.clase;

public class Leasing {
	private float suma;
	private String numeClient;
	
	public Leasing(float suma, String numeClient) {
		super();
		this.suma = suma;
		this.numeClient = numeClient;
	}
	
	public void creazaLeasing() {
		System.out.println(numeClient + " a creat un leasing de " + suma);
	}
}
