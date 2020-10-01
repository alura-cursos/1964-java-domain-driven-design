package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.academico.dominio.aluno.CPF;

public class Selo {

	private CPF cpfDoAluno;
	private String nome;

	public Selo(CPF cpfDoAluno, String nome) {
		this.cpfDoAluno = cpfDoAluno;
		this.nome = nome;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

	public String getNome() {
		return nome;
	}
	
}
