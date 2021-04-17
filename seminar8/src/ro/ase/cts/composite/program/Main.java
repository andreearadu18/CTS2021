package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		// B.8 - Composite
		
		Sectiune bauturi = new Sectiune("Bauturi");
		Sectiune aperitive = new Sectiune("Aperitive");
		
		Item fanta = new Item("Fanta");
		Item cocktail = new Item("Cuba libre");
		Item bruschete = new Item("Bruschete");
		
		bauturi.adaugaComponenta(fanta);
		bauturi.adaugaComponenta(cocktail);
		aperitive.adaugaComponenta(bruschete);
		
		Sectiune meniu = new Sectiune("Meniu");
		meniu.adaugaComponenta(bauturi);
		meniu.adaugaComponenta(aperitive);
		
		meniu.afisareDescriere();
	}

}
