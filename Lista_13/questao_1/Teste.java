package Lista_13.questao_1;

public class Teste {

	public static void main(String[] args) {

		BancoGeral b1 = new Banco();
		
		ContaAbstrata c1 = b1.abrirConta(new Cliente("Eduardo", "12312312312"), "142", 1200.0, "Poupanca");
		
		ContaAbstrata c2 = b1.abrirConta(new Cliente("Monica", "45645645656"), "143", 1200.0, "Conta Corrente");
		
		b1.saque(c1, 100);
		
		b1.deposito(c2, 200);
		
		
		System.out.println("Saldo da primeira conta = " + c1.getSaldo());
		
		System.out.println("Saldo da segunda conta = " + c2.getSaldo());
	}

}
