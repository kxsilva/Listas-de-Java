package Lista_10.questao_2;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa[] array = {new Empregado("Raul", 1200.0), new Estudante("Mateus", "Programacao")};
		
		for(Pessoa p : array) {
			System.out.println(p.getDescricao());
		}
	}

}
