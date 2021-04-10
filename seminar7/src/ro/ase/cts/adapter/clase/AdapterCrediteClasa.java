package ro.ase.cts.adapter.clase;

public class AdapterCrediteClasa extends Leasing implements CreditAbstract {

	public AdapterCrediteClasa(float suma, String numeClient) {
		super(suma, numeClient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.creazaLeasing();
		
	}
	

}
