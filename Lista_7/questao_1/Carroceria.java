package Lista_7.questao_1;

public class Carroceria {

	String tipoCarroceria;
	
	Fabricante fabricante;

	public Carroceria(String tipoCarroceria, Fabricante fabricante) {
		super();
		this.tipoCarroceria = tipoCarroceria;
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Carroceria [tipoCarroceria=" + tipoCarroceria + ", fabricante=" + fabricante + "]";
	}
	
	
}
