package ro.cts.ase.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract{
	private CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	@Override
	public void platesteOnline() {
		cardAbstract.platesteOnline();
		
	}

	@Override
	public void platestePOS() {
		cardAbstract.platestePOS();
		
	}
	
	public abstract void platesteContactless();

	public CardAbstract getCardAbstract() {
		return cardAbstract;
	}


	
}
