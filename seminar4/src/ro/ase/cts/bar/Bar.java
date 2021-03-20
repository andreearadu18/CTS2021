package ro.ase.cts.bar;


public class Bar {
	private String numeBar;
	private int nrLocuriDisponibile;
	private double pretInchiriere;
	
	private static Bar bar = null;
	
	public static synchronized Bar getInstance(String numeBar, int nrLocuriDisponibile, double pretInchiriere) {
		if (bar == null) {
			bar = new Bar(numeBar, nrLocuriDisponibile, pretInchiriere);
		}
		return bar;
	}
	
	private Bar(String numeBar, int nrLocuriDisponibile, double pretInchiriere) {
		super();
		this.numeBar = numeBar;
		this.nrLocuriDisponibile = nrLocuriDisponibile;
		this.pretInchiriere = pretInchiriere;
	}
	
	public void setNumeBar(String numeBar) {
		this.numeBar = numeBar;
	}
	public void setNrLocuriDisponibile(int nrLocuriDisponibile) {
		this.nrLocuriDisponibile = nrLocuriDisponibile;
	}
	public void setPretInchiriere(double pretInchiriere) {
		this.pretInchiriere = pretInchiriere;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bar [numeBar=");
		builder.append(numeBar);
		builder.append(", nrLocuriDisponibile=");
		builder.append(nrLocuriDisponibile);
		builder.append(", pretInchiriere=");
		builder.append(pretInchiriere);
		builder.append("]");
		return builder.toString();
	}
	
	
}
