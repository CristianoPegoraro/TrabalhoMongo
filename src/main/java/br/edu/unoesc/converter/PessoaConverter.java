package br.edu.unoesc.converter;



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

        return mapPessoa;
    }

	


	public Pessoa converterToPessoa(HashMap<String, Object> hashMap) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome((String) hashMap.get("nome"));
        pessoa.setCpf((String) hashMap.get("cpf"));
        pessoa.setFone((String) hashMap.get("fone"));
        pessoa.setEndereco((String) hashMap.get("endereco"));
        pessoa.setBairro((String) hashMap.get("bairro"));

        return pessoa;
    }

}
