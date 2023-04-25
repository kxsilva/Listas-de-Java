package Lista_5.questao_1;

public class Professor extends Funcionario{

	public Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
	}

	@Override
	public double getPrimeiraParcela() {
		return getSalario();
	}
	
	@Override
	public double getSegundaParcela() {
		return 0;
	}
}
