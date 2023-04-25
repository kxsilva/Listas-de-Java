package Lista_4.questao_1;

public class Usado extends Imovel{
	
	public double AcessoDesconto() {
		return this.preco * 0.9;
	}
	
	public void ImpressaoPreco() {
		System.out.println("Preço do imovel usado: " + AcessoDesconto());
	}

	public Usado(String endereco, double preco) {
		super(endereco, preco);
	}
	
	
}
