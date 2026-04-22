package com.github.screenmatch.modelos;

import com.github.screenmatch.calculos.Avaliavel;

public class Episodio implements Avaliavel {
	private String nome;
	private int numero;
	private Serie serie;
	private int totalVisualizacoes;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Serie getSerie() {
		return serie;
	}
	
	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	@Override
	public int getAvaliacao() {
		if (totalVisualizacoes > 100) {
			return 4;
		}
		
		return 2;
	}

	public int getTotalVisualizacoes() {
		return totalVisualizacoes;
	}

	public void setTotalVisualizacoes(int totalVisualizacoes) {
		this.totalVisualizacoes = totalVisualizacoes;
	}
}
