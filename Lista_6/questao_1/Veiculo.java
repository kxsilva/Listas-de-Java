package Lista_6.questao_1;

public class Veiculo {

	private String chassi;
	private String tipo;
	private double velocidadeMaxima;
	private static int cont;
	
	public Veiculo() {}

	public Veiculo(String chassi, String tipo, double velocidadeMaxima) {
		super();
		this.chassi = chassi;
		this.tipo = tipo;
		this.velocidadeMaxima = velocidadeMaxima;
		Veiculo.cont += 1;
	}
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Veiculo.cont = cont;
	}

	public void Limpar() {
		System.out.println("O veículo " + this.tipo + ", com " + this.chassi + " sendo limpo");
	}
	
	public void Ajustar() {
		System.out.println("O veículo " + this.tipo + ", com " + this.chassi + " sendo ajustado.");
	}
	
	public void incrementarVeloc(int velocidade) {
		this.velocidadeMaxima += velocidade;
		
		System.out.println("O veículo " + this.tipo + ", com " + this.chassi + " agora tem " + this.velocidadeMaxima + " km/h de velocidade");
	}
}
