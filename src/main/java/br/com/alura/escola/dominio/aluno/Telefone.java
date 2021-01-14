package br.com.alura.escola.dominio.aluno;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if(numero == null || !numero.matches("\\d{4,5}\\-\\d{4}")) {
			throw new IllegalArgumentException("Numero de telefone inválido");
		}
		if(numero == null || !numero.matches("^\\([1-9]{2}\\)")) {
			throw new IllegalArgumentException("ddd inválido");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
