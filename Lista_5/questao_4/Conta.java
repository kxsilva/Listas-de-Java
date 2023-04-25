package Lista_5.questao_4;

public class Conta {
	
	double saldo;
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(double saque) {
		this.saldo -= saque;
	}
}
