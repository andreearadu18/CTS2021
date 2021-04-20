package ro.ase.cts.state.clase;

public class Rezervata implements IStareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof Libera) {
			masa.setStareMasa(this);
		}
	}

}
