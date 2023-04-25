package Lista_11.questao_1;

public class Cliente extends PessoaFisica implements Autenticavel{

	private double saldo;
	private double limite;
	private double chequeEspecial;
	
	public Cliente(double saldo, double limite, double chequeEspecial) {
		super();
		this.saldo = saldo;
		this.limite = limite;
		this.chequeEspecial = chequeEspecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
