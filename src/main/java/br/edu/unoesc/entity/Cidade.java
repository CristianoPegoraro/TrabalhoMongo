package br.edu.unoesc.entity;





import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
/*@AllArgsConstructor*/
@NoArgsConstructor
@ToString(of = { "nomeCidade", "nomeUF" })

public class Cidade    {

	
	private String nomeCidade;
	private String nomeUF;
	

 public Cidade(String nomeCidade, String nomeUF) {
		this.nomeCidade = nomeCidade;
		this.nomeUF = nomeUF;
		

	}
 
/* public String toString() {
     return "Cidade{" +
             "nomeCidade='" + nomeCidade + '\'' +
             ", nomeUF='" + nomeUF + '\'' +
             '}';
 }*/


}
