package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMementos;
import ro.ase.cts.memento.clase.MeciJucat;
import ro.ase.cts.memento.clase.Memento;

public class Main {

	public static void main(String[] args) {
		//E.15 - memento (in cls memento sunt salvate doar anumite info (originator are toate atrib))
		
		MeciJucat meciJucat = new MeciJucat(10000, "Barcelona", "Real Madrid", 200, 1000);
		Memento memento = meciJucat.creareMemento();
		
		ManagerMementos managerMeci = new ManagerMementos();
		managerMeci.adaugaMemento(memento);
		
		meciJucat.setNrSpectatori(3000);
		meciJucat.setNumeEchipaGazda("PSG");
		meciJucat.setNumeEchipaOaspeti("Manchester United");
		
		managerMeci.adaugaMemento(meciJucat.creareMemento());
		System.out.println(meciJucat);
		
		
		meciJucat.setMemento(managerMeci.getMemento(0));
		System.out.println(meciJucat);
	}

}
