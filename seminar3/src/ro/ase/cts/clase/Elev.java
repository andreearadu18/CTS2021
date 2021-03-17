package ro.ase.cts.clase;


import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasaElev;
	private String tutoreElev;
	private static float sumaFinantare = 30;
	

	public float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public static float getSumaFinantata() {
		return sumaFinantare;
	}
	
	public int getClasa() {
		return clasaElev;
	}
	public void setClasa(int i) {
		this.clasaElev = i;
	}
	public String getTutore() {
		return tutoreElev;
	}
	public void setTutore(String tutore) {
		this.tutoreElev = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Elev: "); 
		stringBuilder.append(super.toString());
		stringBuilder.append(", clasa=").append(clasaElev);
		stringBuilder.append(", tutore=").append(tutoreElev);
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasaElev = clasa;
		this.tutoreElev = tutore;
	}

	
}
