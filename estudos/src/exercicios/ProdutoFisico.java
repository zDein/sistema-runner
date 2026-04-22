package exercicios;

public class ProdutoFisico implements Calculavel {
	
	public int desconto = 10;
	public double valor;
	
	public ProdutoFisico(int desconto, double valor) {
		super();
		this.desconto = desconto;
		this.valor = valor;
	}

	
	// Constructor somente com o valor do livro como parametro (aplica desconto de 15% por padrão)
	public ProdutoFisico(double valor) {
		super();
		this.valor = valor;
	}

	@Override
	public double calcularPrecoFinal() {
		return valor * (desconto / 100);
	}
}
