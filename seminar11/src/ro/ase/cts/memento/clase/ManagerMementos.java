package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMementos {
	private List<Memento> listaMeciuriSalvate;

	public ManagerMementos() {
		super();
		this.listaMeciuriSalvate = new ArrayList<>();	
	}
	
	public void adaugaMemento(Memento memento) {
		this.listaMeciuriSalvate.add(memento);
	}
	
	public Memento getMemento(int poz) {
		if(poz >= 0 && poz < listaMeciuriSalvate.size()) {
			return this.listaMeciuriSalvate.get(poz);
		}
		throw new IndexOutOfBoundsException();
	}
	
	public Memento undoMemento() {
		return this.listaMeciuriSalvate.get(this.listaMeciuriSalvate.size() - 1); //ultima pozitie
	}
}
