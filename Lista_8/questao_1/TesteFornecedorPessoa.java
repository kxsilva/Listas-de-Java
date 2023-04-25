package Lista_8.questao_1;

public class TesteFornecedorPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Nana", "Rua velha", "12312312");
		
		Fornecedor f1 = new Fornecedor("Ching", "Rua chinesa", "12332112", 80, 30);
		
		System.out.println(p1.toString());
		
		System.out.println(f1.toString());

	}

}
