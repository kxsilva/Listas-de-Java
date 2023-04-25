package Lista_4.questao_2;

public class CamaroteSuperior extends VIP{
	
	double adicionalSuperior;

	public CamaroteSuperior(double valor, double adicionalVIP, double adicionalSuperior) {
		super(valor, adicionalVIP);
		this.adicionalSuperior = adicionalSuperior;
	}
	
	public double valorSuperior() {
		return this.valorVIP() + adicionalSuperior;
	}
}
