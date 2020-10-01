package br.com.alura.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.alura.escola.shared.dominio.CPF;

public interface RepositorioDeSelos {

	void adicionar(Selo selo);
	List<Selo> selosDoAlunoDeCPF(CPF cpf);

}
