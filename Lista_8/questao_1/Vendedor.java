package Lista_8.questao_1;

public class Vendedor extends Empregado{

	private double valorVendas;
	private double comissao;
	
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}


	public double getValorVendas() {
		return valorVendas;
	}


	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() * (1 - getImposto()/100) + (this.valorVendas * (1 + this.comissao/100));
	}


	@Override
	public String toString() {
		return "Vendedor [valorVendas=" + valorVendas + ", comissao=" + comissao + ", Salario="
				+ calcularSalario() + ", Salario Base=" + getSalarioBase() + ", Imposto=" + getImposto()
				+ ", Nome=" + getNome() + "]";
	}
	
	
	
}
