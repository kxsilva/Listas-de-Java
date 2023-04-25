package Lista_11.questao_1;

public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	private int numFuncionariosGerenciados;
	
	public Gerente() {}
	
	public Gerente(String nome, int idade, int cpf, double salario, int senha, int numFuncionariosGerenciados) {
		super(nome, idade, cpf, salario);
		this.senha = senha;
		this.numFuncionariosGerenciados = numFuncionariosGerenciados;
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
