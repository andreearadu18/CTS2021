package clase;

public abstract class Animal {
	private String num;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Animal(String num) {
		super();
		this.num = num;
	}
	
}
