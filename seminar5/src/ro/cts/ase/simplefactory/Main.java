package ro.cts.ase.simplefactory;

public class Main {

	public static void main(String[] args) {
		FactorySingleton factory = FactorySingleton.getInstance();
		Jucator portar = factory.getJucator(TipJucator.PORTAR, "Ionel", 32);
		Jucator fundas = factory.getJucator(TipJucator.FUNDAS, "Mirel", 25);
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
