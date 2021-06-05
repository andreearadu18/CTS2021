package dubluriTeste;

import java.util.List;

import clase.IStudent;

public class StudentFake implements IStudent{
	
	private String valoareNume;
	private List<Integer> valoareLista;
	private float valoareMedie;
	private int valoareNota;
	private boolean valoareAreRestanta;
	
	

	public void setValoareNume(String valoareNume) {
		this.valoareNume = valoareNume;
	}

	public void setValoareLista(List<Integer> valoareLista) {
		this.valoareLista = valoareLista;
	}

	public void setValoareMedie(float valoareMedie) {
		this.valoareMedie = valoareMedie;
	}

	public void setValoareNota(int valoareNota) {
		this.valoareNota = valoareNota;
	}

	public void setValoareAreRestanta(boolean valoareAreRestanta) {
		this.valoareAreRestanta = valoareAreRestanta;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return valoareLista;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return valoareMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return valoareNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestanta;
	}

}
