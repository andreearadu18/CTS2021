package ro.ase.cts.flyweight.clase;

public class Client {
	
	//flyweight concret 
	
	private String nume;
	private int tel;
	private String email;
	
	
	public Client(String nume, int tel, String email) {
		super();
		this.nume = nume;
		this.tel = tel;
		this.email = email;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", tel=");
		builder.append(tel);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println(rezervare.toString() + this.toString());
	}
}
