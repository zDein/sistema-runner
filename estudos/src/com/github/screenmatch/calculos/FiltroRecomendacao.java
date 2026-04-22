package com.github.screenmatch.calculos;

public class FiltroRecomendacao {
		
	public void filtraTitulo(Avaliavel avaliavel) {
		if(avaliavel.getAvaliacao() >= 4) {
			System.out.println("Está entre os preferidos do público.");
		} else if (avaliavel.getAvaliacao() >= 2) {
			System.out.println("O filme possui uma avaliação razoável.");
		} else {
			System.out.println("Coloque na sua lista para ver depois.");
		}
	}
}
