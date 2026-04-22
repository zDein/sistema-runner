package exercicios;

public class ConversorMoeda implements ConversaoFinanceira {
	
	private double dolar;
	
	public ConversorMoeda(double dolar) {
		this.dolar = dolar;
	}
	
	@Override
	public double converterDolarParaReal() {
		return dolar * 4.99;
	}
}
