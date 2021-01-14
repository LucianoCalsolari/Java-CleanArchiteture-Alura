package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	/**
	 * O dominio deve ser desacoplado da infraestrutura 
	 * e proximo ao negócio.
	 * 
	 * Classe entidade
	 */
	
	//Id nao é da area de negócios
	
	private String nome;
	private CPF cpf;
	private Email email;	
	
	private List<Telefone> telefones = new ArrayList<>();

	public void adicionarTelefone(String ddd, String numero){
		this.telefones.add(new Telefone(ddd,numero));
	}

	public Aluno(String nome, CPF cpf, Email email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
	
}
