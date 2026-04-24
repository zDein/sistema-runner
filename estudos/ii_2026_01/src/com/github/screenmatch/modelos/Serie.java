package com.github.screenmatch.modelos;

public class Serie extends Titulo {

	private int quantidadeDeTemporadas;
	private int episodiosPorTemporadas;
	private int minutosPorEpisodio;
	private boolean ativa;
	
	public Serie(String nome, String descricao, int duracaoEmMinutos, int anoDeLancamento, double avaliacao,
			int totalDeAvaliacoes, boolean incluidoNoPlano) {
		super(nome, descricao, duracaoEmMinutos, anoDeLancamento, avaliacao, totalDeAvaliacoes, incluidoNoPlano);
	}
	
	public Serie(String nome, String descricao, int quantidadeDeTemporadas, int episodiosPorTemporada, int duracaoEmMinutos, int anoDeLancamento, double avaliacao,
			int totalDeAvaliacoes, boolean incluidoNoPlano) {
		super(nome, descricao, duracaoEmMinutos, anoDeLancamento, avaliacao, totalDeAvaliacoes, incluidoNoPlano);
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return this.quantidadeDeTemporadas * this.episodiosPorTemporadas + this.minutosPorEpisodio;
	}
		
}
