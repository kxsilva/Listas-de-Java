package Lista_11.questao_1;

public class Diretor extends Funcionario implements Autenticavel{

	private int senha;
	
	

	public Diretor(String nome, int idade, int cpf, double salario, int senha) {
		super(nome, idade, cpf, salario);
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBonificador() {
		// TODO Auto-generated method stub
		return 0;
	}
}
