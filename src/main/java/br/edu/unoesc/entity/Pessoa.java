package br.edu.unoesc.entity;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = { "nome", "cpf", "fone", "endereco", "bairro", } )

public class Pessoa    {

	private String id;
	private String nome;
	private String cpf;
	private String fone;
	private String endereco;
	private String bairro;
	

	public Pessoa(String nome, String cpf, String fone ,String endereco, String bairro, Cidade cidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.endereco = endereco;		
		this.bairro = bairro;
		

	}
	

    



}
