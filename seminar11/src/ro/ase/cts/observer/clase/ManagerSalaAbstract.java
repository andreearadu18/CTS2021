package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
	List<Observer> listaClientiAbonati;

	public ManagerSalaAbstract() {
		super();
		this.listaClientiAbonati = new ArrayList<>();
	}
	
	public void aboneaza(Observer o) {
		listaClientiAbonati.add(o);
	}
	public void dezaboneaza(Observer o) {
		listaClientiAbonati.remove(o);
	}
	
	public void notifica(String mesaj) {
		for(Observer o : listaClientiAbonati) {
			o.primesteAnunt(mesaj);
		}
	}
}
