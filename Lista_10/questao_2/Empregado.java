package Lista_10.questao_2;

public class Empregado extends Pessoa{
	
	private double salario;
	
	public Empregado(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String getDescricao() {
		return getNome() + ", salario: " + this.salario;
	}
	
	public void atualizaSalario(double porPercentual) {
		this.salario = this.salario * porPercentual/100;
	}
	
	
	
}
