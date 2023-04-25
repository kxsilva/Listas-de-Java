package Lista_4.questao_1;

public class Novo extends Imovel{
	
	
	public double AcessoAdicional() {
		return this.preco * 1.1;
	}
	
	public void ImpressaoPreco() {
		System.out.println("Preço do imovel novo: " + AcessoAdicional());
	}

	public Novo(String endereco, double preco) {
		super(endereco, preco);

	}
	
	
}
