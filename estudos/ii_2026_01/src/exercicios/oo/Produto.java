package exercicios.oo;

public class Produto {
	private String nome;
	private double preco;
	
	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void aplicarDesconto(double desconto) {
		if (desconto > 0 && desconto <= 100) {
			this.preco -= this.preco * (desconto/100);
		} else {
			System.out.println("Percentual de desconto inválido.");
		}
	}
}
