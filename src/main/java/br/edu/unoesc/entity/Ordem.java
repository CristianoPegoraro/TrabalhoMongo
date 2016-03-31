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
@ToString(of = { "servico", "observacoes" })

public class Ordem   {

	
	private String servico;
	private String observacoes;
	private Pessoa pessoa;
	

	/*public Ordem(String servico, String observacoes, Pessoa pessoa) {
		this.servico = servico;
		this.observacoes = observacoes;
		this.pessoa = pessoa;

	}
*/
}
