package seminar1;

import clase.Animal;
import clase.Giraffe;
import clase.WildCat;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		Animal g = new Giraffe("Tina");
		Giraffe g1 = new Giraffe("Gina");
		WildCat c = new WildCat("Didi");
		WildCat c1 = new WildCat("Jack", "leu");
		
		zoo.addAnimal(c1);
		zoo.addAnimal(c);
		zoo.addAnimal(g1);
		zoo.addAnimal(g);
		
		zoo.feedAll();
	}

}
