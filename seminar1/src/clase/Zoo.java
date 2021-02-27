package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	Zookeeper zookeeper;
	List<Animal> lista;
	public Zoo(Zookeeper zookeeper, List<Animal> lista) {
		super();
		this.zookeeper = zookeeper;
		this.lista = lista;
	}
	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("Gigel");
		this.lista = new ArrayList();
	}
	public void addAnimal(Animal a) {
		lista.add(a);
	}
	
	public void feedAll() {
		for(Animal a : lista) {
			this.zookeeper.feed(a);
		}
	}
	
}
