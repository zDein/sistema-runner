package exercicios.lists_and_collections;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "; Idade: " + this.idade + ".";
	}
}
