package ro.cts.ase.simplefactory;

public class Atacant extends Jucator {

	public Atacant(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []");
		builder.append(super.toString());
		return builder.toString();
	}

}
