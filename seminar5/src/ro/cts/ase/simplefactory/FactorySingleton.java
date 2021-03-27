package ro.cts.ase.simplefactory;

public class FactorySingleton {
	
	private static FactorySingleton factorySingleton= null;
	
	private FactorySingleton() {
		
	}
	
	public static synchronized FactorySingleton getInstance() {
		if(factorySingleton == null) {
			factorySingleton = new FactorySingleton();
		}
		return factorySingleton;
	}
	
	
	public Jucator getJucator(TipJucator tip, String nume, int varsta) {
		switch(tip) {
		case PORTAR: return  new Portar(nume, varsta);
		case FUNDAS: return  new Fundas(nume, varsta);
		case ATACANT: return  new Atacant(nume, varsta);
		default: throw new IllegalArgumentException();
		}
	}
}
