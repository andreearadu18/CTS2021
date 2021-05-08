package ro.ase.cts.chainOfResponsibility.clase;

public class ContEconomii extends Cont{

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(suma<super.getSold()) {
			System.out.println("Se face plata din contul de economii  pt suma "+ suma);
			super.setSold(super.getSold()-suma);
		}else if(super.getCont() != null){ //verific succesor
			super.getCont().realizeazaPlata(suma); //realizez plata cu urmatorul cont setat
		}else { // nu exista alt cont setat
			System.out.println("Tranzactie refuzata");
		}
		
	}

}
