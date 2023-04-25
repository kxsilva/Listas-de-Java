package Lista_12.questao_2;

public class TestaAPI {

	public static void main(String[] args) {

		LinguagemDeProgramacao  l1 = new LinguagemDeProgramacao("Microsoft", "C#");
		
		LinguagemDeProgramacao l2 = new LinguagemDeProgramacao("Apple", "Swift");
		
		l1.imprime(l1.IMPRIME_NOME_DA_EMPRESA);
		
		l2.imprime(l2.NAO_IMPRIME_NOME_DA_EMPRESA);
	}

}
