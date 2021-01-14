package br.com.alura.escola.dominio.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

public class Indicacao {

	private Aluno indicado;
	private Aluno indicante;

	public Indicacao(Aluno indicado, Aluno indicante) {
		super();
		this.indicado = indicado;
		this.indicante = indicante;
	}

}
