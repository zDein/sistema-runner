package exercicios;

public class Livro implements Calculavel {

	int desconto = 15;
	double valor;
	
	public Livro(int desconto, double valor) {
		super();
		this.desconto = desconto;
		this.valor = valor;
	}

	
	// Constructor somente com o valor do livro como parametro (aplica desconto de 15% por padrão)
	public Livro(double valor) {
		super();
		this.valor = valor;
	}

	@Override
	public double calcularPrecoFinal() {
		return valor * (desconto / 100);
	}
}
