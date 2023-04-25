package Lista_4.questao_2;

public class Ingresso {
	
	double valor;
	
	public Ingresso(double valor) {
		super();
		this.valor = valor;
	}

	public void ImprimeValor() {
		System.out.println("valor: R$ " + this.valor);
	}
}
