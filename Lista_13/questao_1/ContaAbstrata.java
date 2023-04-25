package Lista_13.questao_1;

public abstract class ContaAbstrata {

	private String numeroDaConta;
	private double saldo;
	private Cliente cliente;
	
	
	
	public ContaAbstrata(String numeroDaConta, double saldo, Cliente cliente) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public abstract void deposito(double valor);
	
	public abstract void saque(double valor);
	
}
