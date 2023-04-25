package Lista_7.questao_1;

public class Pneu {

	int diametro;
	int medidas;
	
	Fabricante fabricante;

	public Pneu(int diametro, int medidas, Fabricante fabricante) {
		super();
		this.diametro = diametro;
		this.medidas = medidas;
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Pneu [diametro=" + diametro + ", medidas=" + medidas + ", fabricante=" + fabricante + "]";
	}
	
	
}
