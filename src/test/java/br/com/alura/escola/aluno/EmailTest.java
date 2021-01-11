package br.com.alura.escola.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.aluno.Email;

class EmailTest {

	@Test
	void naoDeveCriarEmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Email(null));
		assertThrows(IllegalArgumentException.class,
				() -> new Email(""));
		assertThrows(IllegalArgumentException.class,
				() -> new Email("emailInvalido"));
	}

}
