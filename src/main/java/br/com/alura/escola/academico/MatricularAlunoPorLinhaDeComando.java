package br.com.alura.escola.academico;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.academico.dominio.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAlunoDto dto = new MatricularAlunoDto(
				nome, cpf, email);
		
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		MatricularAluno matricular = new MatricularAluno(
				new RepositorioDeAlunosEmMemoria(), publicador);
		
		matricular.executa(dto);
	}

}
