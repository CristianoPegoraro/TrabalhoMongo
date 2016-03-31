package br.edu.unoesc.converter;



import com.mongodb.DBObject;

import br.edu.unoesc.entity.Cidade;

import java.util.HashMap;
import java.util.Map;

public class CidadeConverter {

	public Map<String, Object> converterToMap(Cidade cidade) {
        Map<String, Object> mapCidade = new HashMap<String, Object>();
        mapCidade.put("nomeCidade", cidade.getNomeCidade());
        mapCidade.put("nomeUF", cidade.getNomeUF());

        return mapCidade;
    }

    public Cidade converterToCidade(HashMap<String, Object> hashMap) {
        Cidade cidade = new Cidade();
        cidade.setNomeCidade((String) hashMap.get("nomeCidade"));
        cidade.setNomeUF((String) hashMap.get("nomeUF"));

        return cidade;
    }
	
}
