package exercicios.lists_and_collections;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.preco = preco;
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [preco=" + preco + ", nome=" + nome + ", quantidade=" + quantidade + "]";
	}

}
