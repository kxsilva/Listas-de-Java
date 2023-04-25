package Lista_12.questao_2;

public class LinguagemDeProgramacao extends Modelo implements Imprimivel{

	private String nomeDaLinguagem;

	public LinguagemDeProgramacao(String nomeDaEmpresa, String nomeDaLinguagem) {
		super(nomeDaEmpresa);
		this.nomeDaLinguagem = nomeDaLinguagem;
	}

	public String getNomeDaLinguagem() {
		return nomeDaLinguagem;
	}

	public void setNomeDaLinguagem(String nomeDaLinguagem) {
		this.nomeDaLinguagem = nomeDaLinguagem;
	}

	@Override
	public void imprime(boolean b) {
		
		if(b) {
			System.out.println(getNomeDaEmpresa());
		}
		else {
			System.out.println("--");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
