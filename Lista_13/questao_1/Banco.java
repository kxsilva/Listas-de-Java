package Lista_13.questao_1;

public class Banco implements BancoGeral{

	@Override
	public ContaAbstrata abrirConta(Cliente c, String numeroDaConta, double saldoInicial, String tipo) {
		if(tipo.equals("Poupanca")) {
			return new Poupanca(numeroDaConta, saldoInicial, c);
		} else {
			return new ContaCorrente(numeroDaConta, saldoInicial, c);
		} 
		
	}

	@Override
	public void deposito(ContaAbstrata c, double valor) {
		c.deposito(valor);
	}

	@Override
	public void saque(ContaAbstrata c, double valor) {
		c.saque(valor);
	}

	
}
