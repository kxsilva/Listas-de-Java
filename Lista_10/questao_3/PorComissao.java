package Lista_10.questao_3;

public class PorComissao extends Empregado implements Commission{

	private double sales;
	
	public PorComissao() {}

	@Override
	public void setVendas(double s) {
		
	}

	@Override
	public double getPay() {
		return 0;
	}
	
	
}
