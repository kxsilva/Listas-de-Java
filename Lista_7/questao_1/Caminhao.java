package Lista_7.questao_1;

public class Caminhao {

	String modelo;
	String placa;
	boolean cabineDupla;
	
	Fabricante fabricante;
	
	Marcha marcha;
	
	Carroceria carroceria;
	
	Pneu pneu;
	
	Motor motor;

	public Caminhao(String modelo, String placa, boolean cabineDupla, Fabricante fabricante, Marcha marcha,
			Carroceria carroceria, Pneu pneu, Motor motor) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.cabineDupla = cabineDupla;
		this.fabricante = fabricante;
		this.marcha = marcha;
		this.carroceria = carroceria;
		this.pneu = pneu;
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Caminhao [modelo=" + modelo + ", placa=" + placa + ", cabineDupla=" + cabineDupla + ", fabricante="
				+ fabricante + ", marcha=" + marcha + ", carroceria=" + carroceria + ", pneu=" + pneu + ", motor="
				+ motor + "]";
	}
	
	
}
