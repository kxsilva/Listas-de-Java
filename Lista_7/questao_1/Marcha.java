package Lista_7.questao_1;

public class Marcha {

	String qtdMarcha;
	
	TipoMarcha tipoMarcha;

	public Marcha(String qtdMarcha, TipoMarcha tipoMarcha) {
		super();
		this.qtdMarcha = qtdMarcha;
		this.tipoMarcha = tipoMarcha;
	}

	@Override
	public String toString() {
		return "Marcha [qtdMarcha=" + qtdMarcha + ", tipoMarcha=" + tipoMarcha + "]";
	}
	
	
}
