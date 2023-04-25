package Lista_4.questao_2;

public class CamaroteInferior extends VIP{
	
	String localizacao;

	public CamaroteInferior(double valor, double adicionalVIP, String localizacao) {
		super(valor, adicionalVIP);
		this.localizacao = localizacao;
	}
	
	public String acessoLocalizacao() {
		return this.localizacao;
	}
	
	public void imprimeLocalizacao() {
		System.out.println("Localização do ingresso: " + acessoLocalizacao());
	}
}
