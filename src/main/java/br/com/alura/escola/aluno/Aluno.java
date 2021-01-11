package br.com.alura.escola.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	/**
	 * O dominio deve ser desacoplado da infraestrutura 
	 * e proximo ao neg�cio.
	 * 
	 * Classe entidade
	 */
	
	//Id nao � da area de neg�cios
	
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
	
	
}