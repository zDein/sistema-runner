package com.github.projetofinal;

public class Podcast extends Audio {
	
	private String apresentador;
	public String getApresentador() {
		return apresentador;
	}

	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}

	private String formato;
	private int totalParticipantes = 0;
	private String[] participantes;
	
	public String getFormato() {
		return formato;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public String[] getParticipantes() {
		return this.participantes;
	}
	
	public void setParticipantes(String participante) {
		if(totalParticipantes <= 4 && participante != null) {
			
			this.participantes[totalParticipantes] = participante;
			totalParticipantes++;
		}
	}
	
}
