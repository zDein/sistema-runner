package exercicios;

import java.time.LocalDate;

public class Carro {
	String modelo;
	int ano;
	String cor;
	
	void exibeFichaTecnica() {
		String carro = """
				Modelo: %s,
				Ano: %d,
				Cor: %s,
				""".formatted(modelo, ano, cor);

		System.out.println(carro);
	}
	
	int calculaIdadeDoCarro() {
		int anoAtual = LocalDate.now().getYear();
		
		return ano - anoAtual;
	}
}
