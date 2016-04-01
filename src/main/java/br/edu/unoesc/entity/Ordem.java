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
@ToString(of = { "id","servico", "observacoes","pessoa","cidade","funcionario" })

public class Ordem   {

	private String id;
	private String servico;
	private String observacoes;
	private Pessoa pessoa;
	private Cidade cidade;
	private Funcionario funcionario;
	

	public Ordem(String servico, String observacoes, Pessoa pessoa, Cidade cidade, Funcionario funcionario) {
		this.servico = servico;
		this.observacoes = observacoes;
		this.pessoa = pessoa;
		this.cidade = cidade;
		this.funcionario = funcionario;

	}

}
