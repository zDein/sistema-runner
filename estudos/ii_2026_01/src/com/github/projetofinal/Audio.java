package com.github.projetofinal;

public class Audio {
	private String Titulo;
	private int duracao;
	private int totalDeReproducoes = 0;
	private int curtidas = 0;
	private int totalAvaliacoes = 0;
	private int classificacao;
	private int anoDePublicacao;
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}
	
	public void acresentaReproduçãoNoAudio() {
		this.totalDeReproducoes += 1;
	}
	
	public void setQuantidadeTotalDeReproducoes(int reproducoes) {
		this.totalDeReproducoes = reproducoes;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void curtirAudio() {
		this.curtidas += 1;
	}
	
	public void setQuantidadeTotalDeCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public int getClassificacaoTotal() {
		return 0;
	}

	public void avaliaFilme(int avaliacao) {
		this.classificacao += avaliacao;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	
	
	
}
