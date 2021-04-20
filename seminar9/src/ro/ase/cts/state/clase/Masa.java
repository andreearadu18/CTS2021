package ro.ase.cts.state.clase;

public class Masa {
	private int nrMasa;
	private IStareMasa stareMasa;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stareMasa = new Libera();
	}
	
	void setStareMasa(IStareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}
	public IStareMasa getStareMasa() {
		return stareMasa;
	}
	
	public void rezervaMasa(String numeClient) {
		if(this.stareMasa instanceof Libera) {
			System.out.println(numeClient + " a rezervat masa " + this.nrMasa);
			this.setStareMasa(new Rezervata());
		}else {
			System.out.println("Masa " + this.nrMasa + " nu poate fi rezervata");
		}
	}
	
	public void ocupaMasa(String numeClient) {
		if(this.stareMasa instanceof Ocupata) {
			System.out.println(numeClient + " a ocupat masa " + this.nrMasa);
			this.setStareMasa(new Ocupata());
		}
		else {
			System.out.println("Masa " + this.nrMasa + " nu poate fi ocupata");
		}
	}
	
	public void elibereazaMasa(String numeClient) {
		if(!(this.stareMasa instanceof Libera)) {
			System.out.println(numeClient + " a eliberat masa " + this.nrMasa);
			this.setStareMasa(new Libera());
		}else {
			System.out.println("Masa " + this.nrMasa + " este deja libera");
		}
	}

}
