package Lista_7.questao_1;

public class Frota {

	String nome;
	String tipo;
	String responsavel;
	
	Carro carro;
	
	Caminhao caminhao;

	public Frota(String nome, String tipo, String responsavel, Carro carro, Caminhao caminhao) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.responsavel = responsavel;
		this.carro = carro;
		this.caminhao = caminhao;
	}

	@Override
	public String toString() {
		return "Frota [nome=" + nome + ", tipo=" + tipo + ", responsavel=" + responsavel + ", carro=" + carro
				+ ", caminhao=" + caminhao + "]";
	}
	
	
}
