package exercicios;

public class Musica {
	String titulo;
	String artista;
	int anoLancamento;
	int numAvalicaoes;
	double avaliacoes;
	
	
	void exibeFichaTecnica() {
		String musica = """
				Titulo: %s,
				Ano de lançamento: %d,
				Artista: %s,
				""".formatted(titulo, artista, anoLancamento);
		
		System.out.println(musica);
	}
	
	void avaliaMusica(double avaliacao) {
		this.avaliacoes += avaliacao;
		numAvalicaoes++;
	}
	
	double mediaDeAvaliacoes() {
		return avaliacoes / numAvalicaoes;
	}
}
