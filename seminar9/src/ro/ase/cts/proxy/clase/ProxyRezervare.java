package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari{

	private OperatorRezervare operatorRezervare;
	private int nrMinimPersoane;
	
	public ProxyRezervare(OperatorRezervare operatorRezervare, int nrMinimPersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.nrMinimPersoane = nrMinimPersoane;
	}

	@Override
	public void rezerva(int nrPers) {
		if(nrPers >= nrMinimPersoane) {
			operatorRezervare.rezerva(nrPers);
		}else {
			System.out.println("Nr de persoane este prea mic!");
		}
		
	}

}
