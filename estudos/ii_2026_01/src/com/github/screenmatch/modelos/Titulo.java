package com.github.screenmatch.modelos;

public class Titulo {
	public Titulo(String nome, String descricao, int duracaoEmMinutos, int anoDeLancamento, double avaliacao,
			int totalDeAvaliacoes, boolean incluidoNoPlano) {
		this.nome = nome;
		this.descricao = descricao;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.anoDeLancamento = anoDeLancamento;
		this.avaliacao = avaliacao;
		this.totalDeAvaliacoes = totalDeAvaliacoes;
		this.incluidoNoPlano = incluidoNoPlano;
	}

	private String nome;
	private String descricao;
	private int duracaoEmMinutos;
	private int anoDeLancamento;
	private double avaliacao = 0;
	private int totalDeAvaliacoes = 0;
	private boolean incluidoNoPlano;
	
	
	public void exibeFichaTecnicaFilme() {
		String titulo = """
				Nome do filme: %s,
				Ano de lançamento: %d,
				Descrição: %s,
				Avaliação: %.2f (IMDb),
				Duração em minutos: %d minutos
				""".formatted(nome, anoDeLancamento, descricao, avaliacao, duracaoEmMinutos);
		
		System.out.println(titulo);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public int getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}
	
	public int getAnoDeLancamento() {
		return this.anoDeLancamento;
	}
	
	public int getTotalDeAvaliacoes() {
		return this.totalDeAvaliacoes;
	}
	
	public boolean getIncluidoPlano() {
		return this.incluidoNoPlano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setDuracaoEmMinutos(int duracao) {
		this.duracaoEmMinutos = duracao;
	}
	
	public void setAnoDeLancamento(int anoLancamento) {
		this.anoDeLancamento = anoLancamento;
	}
	
	public void setAnoIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
	
	public void avaliaTitulo(double nota) {
		totalDeAvaliacoes += 1;
		
		avaliacao += nota;
	}
	
	public double mediaAvaliacoes() {
		return avaliacao / totalDeAvaliacoes;
	}
}
