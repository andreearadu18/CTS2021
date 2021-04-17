package ro.ase.cts.facade.clase;

class Picolo {
	
	private String numePicolo;

	public Picolo(String numePicolo) {
		super();
		this.numePicolo = numePicolo;
	}
	
	public boolean esteDebarasata(Masa masa) {
		return masa.getCod() % 2 == 0; 
	}
	
	public boolean esteAranjata(Masa masa) {
		return masa.getCod() % 5 == 0;
	}

}
