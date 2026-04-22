package com.github.screenmatch.modelos;

public class Serie extends Titulo {

	private int quantidadeDeTemporadas;
	private int episodiosPorTemporadas;
	private int minutosPorEpisodio;
	private boolean ativa;
	
	@Override
	public int getDuracaoEmMinutos() {
		return this.quantidadeDeTemporadas * this.episodiosPorTemporadas + this.minutosPorEpisodio;
	}
		
}
