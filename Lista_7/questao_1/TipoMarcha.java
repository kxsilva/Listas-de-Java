package Lista_7.questao_1;

public class TipoMarcha {

	int cambio;
	
	Fabricante fabricante;

	public TipoMarcha(int cambio, Fabricante fabricante) {
		super();
		this.cambio = cambio;
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "TipoMarcha [cambio=" + cambio + ", fabricante=" + fabricante + "]";
	}
	
	
}
