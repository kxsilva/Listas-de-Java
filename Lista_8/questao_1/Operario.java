package Lista_8.questao_1;

public class Operario extends Empregado{

	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getAtributoComissao() {
		return comissao;
	}

	public void setAtributoComissao(double atributoComissao) {
		this.comissao = atributoComissao;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() * (1 - getImposto()/100) + (this.valorProducao * (1 + this.comissao/100));
	}

	@Override
	public String toString() {
		return "Operario [valorProducao=" + valorProducao + ", comissao=" + comissao + ", Salario="
				+ calcularSalario() + ", Salario Base=" + getSalarioBase() + ", Imposto=" + getImposto()
				+ ", Nome=" + getNome() + "]";
	}
	
	
}
