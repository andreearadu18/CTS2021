package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatieAngajat;
	private int salariuAngajat;
	private static float sumaFinantare = 10;
	
	
	public float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public static float getSumaFinantata() {
		return sumaFinantare;
	}
	
	public String getOcupatie() {
		return ocupatieAngajat;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatieAngajat = ocupatie;
	}
	public int getSalariu() {
		return salariuAngajat;
	}
	public void setSalariu(int salariu) {
		this.salariuAngajat = salariu;
	}
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariuAngajat = salariu;
		this.ocupatieAngajat = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Angajat: "); 
		stringBuilder.append(super.toString());
		stringBuilder.append(", ocupatie=").append(ocupatieAngajat);
		stringBuilder.append(", salariu=").append(salariuAngajat);
		return stringBuilder.toString();

	}
	
	
	
}
