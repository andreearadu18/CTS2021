package ro.ase.cts.decoratormultiplu.program;

import ro.ase.cts.decoratormultiplu.clase.Bilet;
import ro.ase.cts.decoratormultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratormultiplu.clase.DecoratorSustinereEchipa;
import ro.ase.cts.decoratormultiplu.clase.DecoratorUrarePasteFericit;

public class Main {

	public static void main(String[] args) {
		//E.7 - Decorator
		
		Bilet bilet = new Bilet("Steaua", "Rapid");
		bilet.rezervaBilet();
		
		DecoratorAbstract meciInGhencea = new DecoratorSustinereEchipa(bilet);
		meciInGhencea.rezervaBilet();
		
		DecoratorAbstract meciDePaste = new DecoratorUrarePasteFericit(bilet);
		meciDePaste.rezervaBilet();
		
		System.out.println();
		
		//decorare multipla
		
		DecoratorAbstract meciInGhenceaDePaste = new DecoratorSustinereEchipa(meciDePaste);
		meciInGhenceaDePaste.rezervaBilet();

	}

}
