package br.edu.unoesc.converter;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.edu.unoesc.entity.Pessoa;

public class PessoaConverter {

	public Map<String, Object> converterToMap(Pessoa pessoa) {
		Map<String, Object> mapPessoa = new HashMap<String, Object>();
		mapPessoa.put("nome", pessoa.getNome());
		mapPessoa.put("cpf", pessoa.getCpf());
		mapPessoa.put("fone", pessoa.getFone());
		
		
		return mapPessoa;
	}

	public Pessoa converterToPessoa(DBObject dbo) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(dbo.get("_id").toString());
		pessoa.setNome((String) dbo.get("nome"));
		pessoa.setCpf((String) dbo.get("cpf"));
		pessoa.setFone((String) dbo.get("fone"));

		return pessoa;
	}

}
