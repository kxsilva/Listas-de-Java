package Lista_4.questao_2;

public class VIP extends Ingresso{

	double adicionalVIP;

	public VIP(double valor, double adicionalVIP) {
		super(valor);
		this.adicionalVIP = adicionalVIP;
	}
	
	public double valorVIP(){
		return this.valor + adicionalVIP;
	}
	
}
