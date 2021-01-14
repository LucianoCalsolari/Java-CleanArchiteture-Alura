package br.com.alura.escola.dominio.aluno;

public class Email {

	/**
	 * VALUE OBJECT
	 * 
	 */

	private String endereco;

	public Email(String endereco) {
		// valida email com regular expression
		if (endereco == null || !endereco.matches(
				"/^(([^<>()[\\]\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@(([^<>()[\\]\\.,;:\\s@\\\"]+\\.)+[^<>()[\\]\\.,;:\\s@\\\"]{2,})$/i")) {
			throw new IllegalArgumentException("E-mail invalido");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
