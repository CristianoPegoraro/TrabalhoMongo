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
@ToString(of = { "id","servico", "observacoes","pessoa","cidade" })

public class Ordem   {

	private String id;
	private String servico;
	private String observacoes;
	private Pessoa pessoa;
	private Cidade cidade;
	

	public Ordem(String servico, String observacoes, Pessoa pessoa, Cidade cidade) {
		this.servico = servico;
		this.observacoes = observacoes;
		this.pessoa = pessoa;
		this.cidade = cidade;

	}

}
