package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<ComandaAbstracta> listaComenzi;

	public ManagerComenzi() {
		super();
		this.listaComenzi = new ArrayList<>();
	}
	
	public void invocaComanda(ComandaAbstracta comandaAbstracta) {
		listaComenzi.add(comandaAbstracta);
	}
	
	public void executaComanda() {
		if(listaComenzi.size() > 0) { //fol principiul cozii - exe doar o comanda
			listaComenzi.get(0).executa();
			listaComenzi.remove(0);
		
		}
	}
}
