package Lista_10.questao_2;

public class Estudante extends Pessoa{

	private String areaDeEstudo;

	public Estudante(String nome, String areaDeEstudo) {
		super(nome);
		this.areaDeEstudo = areaDeEstudo;
	}

	@Override
	public String getDescricao() {
		return getNome() + ", area de estudo: " + areaDeEstudo;
	}
	
	
}
