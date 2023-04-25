package Lista_12.questao_1;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel{

	private int numeroCilindros;

	@Override
	public void estacionar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean estaParado() {
		// TODO Auto-generated method stub
		return super.estaParado();
	}
	
	public void curvar(float angulo) {}
	
	public void abastecer(int qtdLitros) {}
	
	public void ligarMotor() {}
	
	public void embrear() {}
	
	
}
