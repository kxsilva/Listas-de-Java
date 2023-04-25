package Lista_11.questao_1;

import java.util.Objects;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private int cpf;
	
	public Pessoa() {}

	public Pessoa(String nome, int idade, int cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}


	public int getCpf() {
		return cpf;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return cpf == other.cpf;
	}
	
	
}
