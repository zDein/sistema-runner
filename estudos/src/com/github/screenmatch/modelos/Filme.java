package com.github.screenmatch.modelos;

import com.github.screenmatch.calculos.Avaliavel;

public class Filme extends Titulo implements Avaliavel {
	
	private String diretor;
	
	
	public String getDiretor() {
		return this.diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public int getAvaliacao() {
		return (int) mediaAvaliacoes();
	}
}
