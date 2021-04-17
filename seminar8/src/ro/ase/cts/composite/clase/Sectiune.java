package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ComponentaMeniu{

	private List<ComponentaMeniu> componente;
	
	public Sectiune(String nume) {
		super(nume);
		this.componente = new ArrayList<>();
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Sectiune: " + this.getNume());
		for(ComponentaMeniu comp : this.componente) {
			comp.afisareDescriere();
		}
	}

	@Override
	public ComponentaMeniu getComponenta(int poz) throws Exception {
		if(poz < componente.size() && poz >= 0) {
		return componente.get(poz);
		}else {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu comp) {
		componente.add(comp);
	}

	@Override
	public void stergeComponenta(ComponentaMeniu comp) {
		componente.remove(comp);
	}

}
