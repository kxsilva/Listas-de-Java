package Lista_12.questao_2;

public abstract class Modelo {
	
	private String nomeDaEmpresa;

	public Modelo(String nomeDaEmpresa) {
		super();
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	
	public abstract String toString();
}
