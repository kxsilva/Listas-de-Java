package Lista_12.questao_1;

public abstract class TransporteAereo extends Transporte{

	private int altitudeAtual;
	
	public abstract void subir(int metros);
	
	public abstract void descer(int metros);
}
