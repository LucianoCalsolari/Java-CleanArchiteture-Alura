package escola;

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
}
