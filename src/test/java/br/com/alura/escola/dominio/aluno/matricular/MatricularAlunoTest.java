package br.com.alura.escola.dominio.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
				
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados= new MatricularAlunoDto("Fulano", "123.456.789-00", "fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
	}
}
