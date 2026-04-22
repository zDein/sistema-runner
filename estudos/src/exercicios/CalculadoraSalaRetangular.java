package exercicios;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
	
	private double altura;
	private double largura;
	
	public CalculadoraSalaRetangular(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return altura * largura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (altura + largura);
	}
	
	
}
