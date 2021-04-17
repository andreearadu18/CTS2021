package ro.ase.cts.facade.program;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;

public class Program {
	//B.6 - facade
	
	public static void main(String[] args) {
		
		//Masa m1 = new Masa(12,4);
		/*if(OperatorMese.esteLiber(m1)) {
			Picolo picolo = new Picolo("Ionel");
			if(picolo.esteDebarasata(m1)&&picolo.esteAranjata(m1)) {
				System.out.println("Poftit la masa!");
			}else {
				System.out.println("Mai asteptati.");
			}
			}else {
				System.out.println("Mai asteptati.");
		}*/
		//System.out.println();
		
		
		Masa m2 = new Masa(10,0);
		if(Facade.potInvitaOameniiLaMasa(m2)) {
			System.out.println("Poftit la masa!");
		}else {
			System.out.println("Mai asteptati.");
		}
	
	}
}
