package Lista_6.questao_1;

public class Bicicleta extends Veiculo{

	private int nrMarchas;
	
	public Bicicleta() {}

	public Bicicleta(String chassi, String tipo, double velocidadeMaxima, int nrMarchas) {
		super(chassi, tipo, velocidadeMaxima);
		this.nrMarchas = nrMarchas;
	}

	public int getNrMarchas() {
		return nrMarchas;
	}

	public void setNrMarchas(int nrMarchas) {
		this.nrMarchas = nrMarchas;
	}
	
	public void aumentarMarcha(int marcha) {
		this.nrMarchas += marcha;
		incrementarVeloc((int) ((this.nrMarchas / getVelocidadeMaxima()) * 100));
	}
	
}
