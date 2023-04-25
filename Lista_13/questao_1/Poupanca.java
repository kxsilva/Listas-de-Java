package Lista_13.questao_1;

public class Poupanca extends ContaAbstrata{
	
	

	public Poupanca(String numeroDaConta, double saldo, Cliente cliente) {
		super(numeroDaConta, saldo, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposito(double valor) {
		setSaldo(getSaldo() + valor);
		
	}

	@Override
	public void saque(double valor) {
		setSaldo(getSaldo() - valor);
		
	}

	public void renderJuros() {
		setSaldo(getSaldo()*1.01);
	}
}
