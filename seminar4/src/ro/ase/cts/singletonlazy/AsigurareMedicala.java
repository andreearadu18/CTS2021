package ro.ase.cts.singletonlazy;


//problema: getInstance pe mai multe fire de exe-> intra in if de mai multe ori, deci se incalca singleton
//solutie: fol synchronized pt a bloca functia

public class AsigurareMedicala {
	private int id;
	private String numeAsigurat;
	private float contributie;
	
	private static AsigurareMedicala asigurareMedicala = null;
			
	private AsigurareMedicala(int id, String numeAsigurat, float contributie) {
		super();
		this.id = id;
		this.numeAsigurat = numeAsigurat;
		this.contributie = contributie;
	}

	public static synchronized AsigurareMedicala getInstance(int id, String numeAsigurat, float contributie) {
		if(asigurareMedicala == null) {
			asigurareMedicala = new AsigurareMedicala(id, numeAsigurat, contributie);
		}
		return asigurareMedicala;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}


	public void setNumeAsigurat(String numeAsigurat) {
		this.numeAsigurat = numeAsigurat;
	}


	public void setContributie(float contributie) {
		this.contributie = contributie;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsigurareMedicala [id=");
		builder.append(id);
		builder.append(", numeAsigurat=");
		builder.append(numeAsigurat);
		builder.append(", contributie=");
		builder.append(contributie);
		builder.append("]");
		return builder.toString();
	}
	
	
}
