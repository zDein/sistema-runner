package exercicios;

public class Aluno {
	private String nome;
	private double notas = 0; // adicionado para o 4 exercicio
	private int quantidadeNotas = 0;
	private int idade;
	
	public String getNome() {
		return this.nome;
	}

	public double getNotas() {
		return this.notas;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNotas(double notas) {
		this.notas += notas;
		this.quantidadeNotas++;
	}
	
	public double calcularMedia() {
		if(quantidadeNotas > 0) {
			return notas / quantidadeNotas;
		} else {
			return 0;
		}
	}
	
	public void exibeInformacoesDoAluno() {
		String aluno = """
				Nome do aluno: %s,
				Idade do aluno: %d,
				""".formatted(nome, idade);
		
		System.out.println(aluno);
	}
}
