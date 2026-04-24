package exercicios.oo;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

	double temperatura;
	
	public ConversorTemperaturaPadrao(double temperatura) {
		super();
		this.temperatura = temperatura;
	}

	@Override
	public double celsiusParaFahrenheit() {
		// TODO Auto-generated method stub
		return (temperatura * 1.8) + 32;
	}

	@Override
	public double fahrenheitParaCelsius() {
		// TODO Auto-generated method stub
		return (temperatura - 32) / 1.8;
	}
	
}
