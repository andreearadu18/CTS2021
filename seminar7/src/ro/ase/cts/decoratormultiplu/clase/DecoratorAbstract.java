package ro.ase.cts.decoratormultiplu.clase;

public abstract class DecoratorAbstract implements IOperatorBilet{

	private IOperatorBilet bilet;
	
	public DecoratorAbstract(IOperatorBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBilet() {
		bilet.rezervaBilet();		
	}
	
	public String getNumeEchipaGazda() {
		return bilet.getNumeEchipaGazda();
	}


	public String getNumeEchipaOaspeti() {
		return bilet.getNumeEchipaOaspeti();
	}
	

}
