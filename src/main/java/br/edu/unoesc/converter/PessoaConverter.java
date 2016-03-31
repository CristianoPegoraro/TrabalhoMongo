package br.edu.unoesc.converter;




import com.mongodb.DBObject;

import br.edu.unoesc.entity.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class PessoaConverter {

	public Map<String, Object> converterToMap(Pessoa pessoa) {
		Map<String, Object> mapPessoa = new HashMap<String, Object>();
		mapPessoa.put("nome", pessoa.getNome());
		mapPessoa.put("cpf", pessoa.getCpf());
		mapPessoa.put("fone", pessoa.getFone());
		mapPessoa.put("endereco", pessoa.getEndereco());
		mapPessoa.put("bairro", pessoa.getBairro());
		mapPessoa.put("cidade",
                new PessoaConverter().converterToMap(pessoa.getCidade())
        );
		

		return mapPessoa;
	}

	public Pessoa converterToPessoa(DBObject dbo) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome((String) dbo.get("nome"));
		pessoa.setCpf((String) dbo.get("cpf"));
		pessoa.setCpf((String) dbo.get("fone"));
		pessoa.setCpf((String) dbo.get("bairo"));
		pessoa.setCpf((String) dbo.get("cpf"));
		pessoa.setCidade(new CidadeConverter().converterToCidade(
                (HashMap<String, Object>) dbo.get("cidade"))
        );

		
		return pessoa;
	}

}
