package br.edu.unoesc.converter;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.edu.unoesc.entity.Pessoa;

public class PessoaConverter {

	public Map<String, Object> converterToMap(Pessoa pessoa) {
		Map<String, Object> mapPessoa = new HashMap<String, Object>();
		mapPessoa.put("Nome", pessoa.getNome());
		mapPessoa.put("Cpf", pessoa.getCpf());
		mapPessoa.put("Fone", pessoa.getFone());
		
		
		return mapPessoa;
	}

	public Pessoa converterToPessoa(DBObject dbo) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(dbo.get("_id").toString());
		pessoa.setNome((String) dbo.get("Nome"));
		pessoa.setCpf((String) dbo.get("Cpf"));
		pessoa.setFone((String) dbo.get("Fone"));

		return pessoa;
	}

}
