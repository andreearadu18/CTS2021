package clase;

public class Zookeeper {
	String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	}
	public void feed(Animal a) {
		System.out.println("Ingrijitorul " + this.nume + " hraneste animalul "+ a.getNum());
	}
}
