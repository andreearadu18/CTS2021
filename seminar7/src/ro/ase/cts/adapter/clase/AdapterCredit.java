package ro.ase.cts.adapter.clase;

public class AdapterCredit implements CreditAbstract {
	//adaptam leasing la credit
	
	private Leasing leasing;
	
	public AdapterCredit(Leasing leasing) {
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit() {
		leasing.creazaLeasing();
		
	}

}
