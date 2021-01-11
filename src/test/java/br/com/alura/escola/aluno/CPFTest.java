package br.com.alura.escola.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.aluno.CPF;

class CPFTest {

	@Test
	void naoDeveCriarCPFComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new CPF(null));
		assertThrows(IllegalArgumentException.class,
				() -> new CPF(""));
		assertThrows(IllegalArgumentException.class,
				() -> new CPF("cpfInvalido"));
	}

}
