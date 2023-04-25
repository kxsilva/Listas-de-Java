package Lista_13.questao_1;

public class ContaCorrente extends ContaAbstrata{

	public ContaCorrente(String numeroDaConta, double saldo, Cliente cliente) {
		super(numeroDaConta, saldo, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposito(double valor) {
		setSaldo(getSaldo() + valor);
		
	}

	@Override
	public void saque(double valor) {
		setSaldo(getSaldo() - valor*1.01); 
	}

}
