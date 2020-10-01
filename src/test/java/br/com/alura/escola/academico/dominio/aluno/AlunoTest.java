package br.com.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.shared.dominio.CPF;

class AlunoTest {

	private Aluno aluno;

	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(
				new CPF("123.456.789-00"), 
				"Fulano da Silva", 
				new Email("fulano@email.com"));
	}

	@Test
	void deveriaPermitirAdicionar1Telefone() {
		this.aluno.adicionarTelefone("11", "99999999");
		assertEquals(1, this.aluno.getTelefones().size());
	}

	@Test
	void deveriaPermitirAdicionar2Telefones() {
		this.aluno.adicionarTelefone("11", "99999999");
		this.aluno.adicionarTelefone("11", "88888888");
		assertEquals(2, this.aluno.getTelefones().size());
	}

	@Test
	void naoDeveriaPermitirAdicionar3Telefones() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.adicionarTelefone("11", "99999999");
			this.aluno.adicionarTelefone("11", "88888888");
			this.aluno.adicionarTelefone("11", "77777777");
		});
	}

}
