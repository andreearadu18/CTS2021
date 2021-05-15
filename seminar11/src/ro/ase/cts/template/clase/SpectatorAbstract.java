package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	
	//template abstract
	//protected/public in functie de situatie
	
	public abstract void asezareCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControlCorporal();
	public abstract void ocupareLoc();
	public final void intrarePeStadion() {
		
		 asezareCoada();
		 prezintaBilet();
		 realizareControlCorporal();
		 ocupareLoc();
		
	}
}
