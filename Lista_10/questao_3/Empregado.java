package Lista_10.questao_3;

public abstract class Empregado {
	
	private String name;

	public Empregado() {};
	
	public Empregado(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printPay() {}
	
	public abstract double getPay();
	
}
