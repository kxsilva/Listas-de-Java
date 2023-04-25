package Lista_6.questao_1;

public class Carro extends Veiculo{

	private double combustivel;
	
	public Carro() {}

	public Carro(String chassi, String tipo, double velocidadeMaxima, double combustivel) {
		super(chassi, tipo, velocidadeMaxima);
		this.combustivel = combustivel;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public void trocarOleo() {
		System.out.println("O veiculo " + getTipo() + ", com " + getChassi() + " trocou o oleo.");
	}
	
}
