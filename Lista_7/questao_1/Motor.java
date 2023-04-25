package Lista_7.questao_1;

public class Motor {

	int potencia;
	String chassi;
	int torque;
	
	
	public Motor(int potencia, String chassi, int torque) {
		super();
		this.potencia = potencia;
		this.chassi = chassi;
		this.torque = torque;
	}


	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", chassi=" + chassi + ", torque=" + torque + "]";
	}
	
	
}
