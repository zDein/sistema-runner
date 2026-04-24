package com.github.screenmatch.modelos;

import com.github.screenmatch.calculos.Avaliavel;

public class Filme extends Titulo implements Avaliavel {
	
	private String diretor;
	
	
	public Filme(String nome, String descricao, String diretor, int duracaoEmMinutos, int anoDeLancamento, double avaliacao,
			int totalDeAvaliacoes, boolean incluidoNoPlano) {
		super(nome, descricao, duracaoEmMinutos, anoDeLancamento, avaliacao, totalDeAvaliacoes, incluidoNoPlano);
		this.diretor = diretor;
	}
	
	public String getDiretor() {
		return this.diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public int getAvaliacao() {
		return (int) mediaAvaliacoes();
	}
	
	@Override
	public String toString() {
		return "Filme: " + super.getNome() + " (" + super.getAnoDeLancamento() + ")";
	}
}
