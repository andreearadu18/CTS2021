package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean potInvitaOameniiLaMasa(Masa masa) {
		if(OperatorMese.esteLiber(masa)) {
			Picolo picolo = new Picolo("Cristi");
			if(picolo.esteDebarasata(masa)&&picolo.esteAranjata(masa)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
}
