package Lista_5.questao_1;

public class Funcionario extends Pessoa{

	private int matricula;
	private double salario;
	
	public Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
		if (this.salario < 0) this.salario = 0;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(salario < 0) {
			this.salario = 0;
		}
		else {
			this.salario = salario;
		}
	}
	
	public double getPrimeiraParcela() {
		return this.salario*0.6;
	}
	
	public double getSegundaParcela() {
		return this.salario*0.4;
	}
	
	
	
	
}
