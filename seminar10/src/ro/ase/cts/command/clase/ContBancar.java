package ro.ase.cts.command.clase;

public class ContBancar {
	//executant
	private String detinator;
	private float sold;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		//sold initiat la constituriea contului
	}
	
	public void constituire(float suma) {
		sold = suma;
		System.out.println("S-a facut constituirea contului cu suma " + this.sold);
	}
	
	public void depunere(float suma) {
		sold += suma;
		System.out.println("S-a facut depunerea cu suma " + suma);
	}
	
	public void retragere(float suma) {
		if(suma < this.sold) {
			sold -= suma;
			System.out.println("S-a facut retragerea cu suma " + suma);
		}else {
			System.out.println("Fonduri insuficiente");
		}
	}
}
