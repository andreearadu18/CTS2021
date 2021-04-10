package ro.cts.ase.decorator.clase;

public class DecoratorContactlessSimplu extends DecoratorAbstract{

	public DecoratorContactlessSimplu(CardAbstract cardAbstract) {
		super(cardAbstract);

	}

	@Override
	public void platesteContactless() {
		
		System.out.println(((Card)super.getCardAbstract()).getNumeTitular() + " a platit contactless");
	}

}
