package Lista_10.questao_3;

public class PorHora extends Empregado{

	private double valorHora;
	private int numHora;
	
	public PorHora() {}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumHora() {
		return numHora;
	}

	public void setNumHora(int numHora) {
		this.numHora = numHora;
	}

	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
