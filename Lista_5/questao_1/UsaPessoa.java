package Lista_5.questao_1;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("José", "Manoel");
		Funcionario pessoa2 = new Funcionario("Leandro", "Charles", 123, 2000.0);
		Professor pessoa3 = new Professor("Rita", "Cassia", 124, 500.0);
		
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());
		
		
		System.out.println("Pessoa 2 - Funcionario");
		System.out.println("Primeira parcela - " + pessoa2.getPrimeiraParcela());
		System.out.println("Segunda parcela - " + pessoa2.getSegundaParcela());
		
		System.out.println("Pessoa 3 - Professor");
		System.out.println("Primeira parcela - " + pessoa3.getPrimeiraParcela());
		System.out.println("Segunda parcela - " + pessoa3.getSegundaParcela());
	}

}
