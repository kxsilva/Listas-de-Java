package Lista_8.questao_1;

public class Administrador extends Empregado{

	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		return (getSalarioBase() * (1 - getImposto()/100)) + ajudaDeCusto;
	}


	@Override
	public String toString() {
		return "Administrador [ajudaDeCusto=" + ajudaDeCusto + ", Salario=" + calcularSalario()
				+ ", Salario Base=" + getSalarioBase() + ", Imposto=" + getImposto() + ", Nome="
				+ getNome() + "]";
	}
	
	
}
