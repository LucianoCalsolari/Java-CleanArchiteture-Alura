package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveCriarTelefoneComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone(null,null));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("",""));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("1","245-687"));
	}
	@Test
	void naoDeveCriarTelefoneComDDDInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("1","2458-6874"));
	}

}
