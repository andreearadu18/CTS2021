package dubluriTeste;

import java.util.List;

import clase.IStudent;

public class StudentStub implements IStudent{

	@Override
	public String getNume() {
		return "Maria";
	}

	@Override
	public void setNume(String nume) {
		
	}

	@Override
	public List<Integer> getNote() {
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		
	}

	@Override
	public float calculeazaMedie() {
		return 6.5f;
	}

	@Override
	public int getNota(int index) {
		return 9;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
