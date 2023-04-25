package Lista_7.questao_1;

public class Carro {
	
	String modelo;
	String placa;
	
	Fabricante fabricante;
	
	Motor motor;
	
	Pneu pneu;

	public Carro(String modelo, String placa, Fabricante fabricante, Motor motor, Pneu pneu) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.fabricante = fabricante;
		this.motor = motor;
		this.pneu = pneu;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", placa=" + placa + ", fabricante=" + fabricante + ", motor=" + motor
				+ ", pneu=" + pneu + "]";
	}
	
	

}
