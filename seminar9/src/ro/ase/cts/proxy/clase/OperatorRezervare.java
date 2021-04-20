package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervari{

	private String numeRestaurant;
	
	public OperatorRezervare(String numeRestaurant) {
		super();
		this.numeRestaurant = numeRestaurant;
	}
	
	@Override
	public void rezerva(int nrPers) {
		System.out.println("A fost realizata o rezervare de " + nrPers + " persoane la restaurantul " + this.numeRestaurant);
	}

}
