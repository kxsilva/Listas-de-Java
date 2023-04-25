package Lista_7.questao_1;

public class Fabricante {

	String nome;
	String cnpj;
	
	
	public Fabricante(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}


	@Override
	public String toString() {
		return "Fabricante [nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
	
}
