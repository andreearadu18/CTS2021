package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String numeAplicant;
	protected String prenumeAplicat;
	protected int varstaAplicant;
	protected int punctajProiect;
	protected int nr_proiecte;
	protected String[] denumireProiect;
	
	
	public String getNume() {
		return numeAplicant;
	}
	public void setNume(String nume) {
		this.numeAplicant = nume;
	}
	public String getPrenume() {
		return prenumeAplicat;
	}
	public void setPrenume(String prenume) {
		this.prenumeAplicat = prenume;
	}
	public int getVarsta() {
		return varstaAplicant;
	}
	public void setVarsta(int varsta) {
		this.varstaAplicant = varsta;
	}

	public void afisareRaspunsProiect(Proiect proiect){
		
		boolean esteAcceptat = punctajProiect >= proiect.getPragAcceptare();
		
		StringBuilder stringBuilder = new StringBuilder("Aplicantul ").append(numeAplicant).append(" ")
				.append(prenumeAplicat).append(" ");
		stringBuilder.append(esteAcceptat? " a fost acceptat" : " a fost respins.");
		
		System.out.println(stringBuilder.toString());
	}
	
	public int getPunctaj() {
		return punctajProiect;
	}
	public void setPunctaj(int punctaj) {
		this.punctajProiect = punctaj;
	}
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.numeAplicant = nume;
		this.prenumeAplicat = prenume;
		this.varstaAplicant = varsta;
		this.punctajProiect = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
		
	}

	
	public String[] getDenumireProiect() {
		return denumireProiect;
	}
	public void setDenumiriProiecte(String[] denumireProiect, int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicant [nume=");
		builder.append(numeAplicant);
		builder.append(", prenume=");
		builder.append(prenumeAplicat);
		builder.append(", varsta=");
		builder.append(varstaAplicant);
		builder.append(", punctaj=");
		builder.append(punctajProiect);
		builder.append(", nr_proiecte=");
		builder.append(nr_proiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		builder.append("]");
		return builder.toString();
	}
	
	public abstract float getSumaFinantare();
	
	

}
