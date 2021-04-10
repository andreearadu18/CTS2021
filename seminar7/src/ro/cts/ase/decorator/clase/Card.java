package ro.cts.ase.decorator.clase;

public class Card implements CardAbstract{
	private String numeTitular;
	private String numarCard;
	public Card(String numeTitular, String numarCard) {
		super();
		this.numeTitular = numeTitular;
		this.numarCard = numarCard;
	}
	@Override
	public void platesteOnline() {
		System.out.println(this.numeTitular + " a realizat o plata online");
		
	}
	@Override
	public void platestePOS() {
		System.out.println(this.numeTitular + " a realizat o plata la POS");
		
	}
	public String getNumeTitular() {
		return numeTitular;
	}
	public String getNumarCard() {
		return numarCard;
	}
	
	
	
}
