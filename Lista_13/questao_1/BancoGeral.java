package Lista_13.questao_1;

public interface BancoGeral {

	ContaAbstrata abrirConta(Cliente c, String numeroDaConta, double saldoInicial, String tipo);
	
	void deposito(ContaAbstrata c, double valor);
	
	void saque(ContaAbstrata C, double valor);
}
