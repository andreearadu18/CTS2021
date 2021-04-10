package ro.cts.ase.decorator.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract {


	public DecoratorContactlessTelefon(CardAbstract cardAbstract) {
		super(cardAbstract);
		
	}

	@Override
	public void platesteContactless() {
		System.out.println(((Card)super.getCardAbstract()).getNumeTitular() + " a platit contactless cu telefonul");
		
	}

}
