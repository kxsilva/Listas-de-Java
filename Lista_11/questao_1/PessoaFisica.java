package Lista_11.questao_1;

public abstract class PessoaFisica extends Pessoa{

	private int cpf;
	
	public PessoaFisica() {}

	public PessoaFisica(String nome, int idade, int cpf) {
		super(nome, idade, cpf);
		// TODO Auto-generated constructor stub
	}

	public int getCpf() {
		return cpf;
	}

	
}
