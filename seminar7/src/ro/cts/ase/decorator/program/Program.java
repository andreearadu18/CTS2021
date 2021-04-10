package ro.cts.ase.decorator.program;

import ro.cts.ase.decorator.clase.Card;
import ro.cts.ase.decorator.clase.DecoratorAbstract;
import ro.cts.ase.decorator.clase.DecoratorContactlessSimplu;
import ro.cts.ase.decorator.clase.DecoratorContactlessTelefon;

public class Program {

	public static void main(String[] args) {
		//D.6 - Decorator
		
		Card card = new Card("Maria", "25563156321");
		card.platesteOnline();
		card.platestePOS();
		
		DecoratorAbstract decoratorAbstract = new DecoratorContactlessSimplu(card);
		decoratorAbstract.platesteContactless();
		decoratorAbstract.platesteOnline();
		decoratorAbstract.platestePOS();
		
		DecoratorAbstract decoratorAbstract2 = new DecoratorContactlessTelefon(card);
		decoratorAbstract2.platesteContactless();
	

	}
}
