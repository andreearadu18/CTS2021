package ro.cts.ase.prototype.clase;

public class ClientStadion implements AbstractPrototype{
	private String denumire;
	private int varsta;
	
	public ClientStadion(String denumire, int varsta) {
		super();
		//validari
		this.denumire = denumire;
		//clientul este major?
		this.varsta = varsta;
	}
	
	private ClientStadion() {
		super();
		
	}
	
	public String getDenumire() {
		return denumire;
	}
	public int getVarsta() {
		return varsta;
	}

	public void setDenumire(String denumire) {
		//validari
		this.denumire = denumire;
	}

	public void setVarsta(int varsta) {
		//validari
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientStadion [denumire=");
		builder.append(denumire);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		ClientStadion clona = new ClientStadion();
		clona.denumire = this.denumire;
		clona.varsta = this.varsta;
		return clona;
	}
	
}
