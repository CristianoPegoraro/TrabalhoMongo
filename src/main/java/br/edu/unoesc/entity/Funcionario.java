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
@ToString(of = { "nomeFuncionario", "setor", "cargo" } )

public class Funcionario {

	private String id;
	private String nomeFuncionario;
	private String setor;
	private String cargo;
	

	
	public Funcionario(String nomeFuncionario, String setor, String cargo ) {
		this.nomeFuncionario = nomeFuncionario;
		this.setor = setor;
		this.cargo = cargo;
				

}
}

