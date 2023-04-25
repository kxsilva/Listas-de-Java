package Lista_11.questao_2;

public class Cliente implements DAO{
	
	private int codigo;
	private String nome;
	
	
	public Cliente(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void inserir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void localizar() {
		// TODO Auto-generated method stub
		
	}
}
