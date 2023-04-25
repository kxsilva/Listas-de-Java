package Lista_9.questao_1;

public class Classe2 extends Classe1{

	int n2;

	public Classe2(int n1, int n2) {
		super(n1);
		this.n2 = n2;
	}
	
	@Override
	public void imprimirValor() {
		System.out.println(this.n2);
	}
}
