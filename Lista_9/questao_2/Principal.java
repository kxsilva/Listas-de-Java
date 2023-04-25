package Lista_9.questao_2;

public class Principal {

	public static void main(String[] args) {
		
		AlunoEscola ae1 = new AlunoEscola();
		AlunoEscola ae2 = new AlunoEscola();
		AlunoEscola ae3 = new AlunoEscola();
		
		AlunoGraduacao ag1 = new AlunoGraduacao(); 
		AlunoGraduacao ag2 = new AlunoGraduacao(); 
		AlunoGraduacao ag3 = new AlunoGraduacao(); 
		
		AlunoPosGraduacao  apg1 = new AlunoPosGraduacao();
		AlunoPosGraduacao  apg2 = new AlunoPosGraduacao();
		AlunoPosGraduacao  apg3 = new AlunoPosGraduacao();
		
		Object[] array = {ae1, ae2, ae3,ag1,ag2,ag3,apg1,apg2,apg3};
		
		
		ae1.info("caio");
		ae2.info("catia");
		ae3.info("carlos");
		
		ag1.info("caio", "gastro");
		ag2.info("catia", "direito");
		ag3.info("caio", "engenharia");
		
		apg1.info("caio", "gastro", "confeitaria");
		apg1.info("catia", "direito", "direito penal");
		apg1.info("carlos", "engenharia", "automacao");
	}

}
