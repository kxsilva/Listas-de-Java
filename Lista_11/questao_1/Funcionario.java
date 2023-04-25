package Lista_11.questao_1;

public abstract class Funcionario extends PessoaFisica{

	private double salario;
	
	public Funcionario() {}

	public Funcionario(String nome, int idade, int cpf, double salario) {
		super(nome, idade, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	
	public abstract double getBonificador();
}
