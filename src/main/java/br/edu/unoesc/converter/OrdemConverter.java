package br.edu.unoesc.converter;


import com.mongodb.DBObject;

import br.edu.unoesc.entity.Ordem;

import java.util.HashMap;
import java.util.Map;

public class OrdemConverter {

	public Map<String, Object> converterToMap(Ordem ordem) {
		Map<String, Object> mapOrdem = new HashMap<String, Object>();
		mapOrdem.put("pessoa", new PessoaConverter().converterToMap(ordem.getPessoa()));
		mapOrdem.put("cidade", new CidadeConverter().converterToMap(ordem.getCidade()));
		mapOrdem.put("servico", ordem.getServico());
		mapOrdem.put("observacoes", ordem.getObservacoes());
		

		return mapOrdem;
	}

	public Ordem converterToOrdem(DBObject dbo) {
		Ordem ordem = new Ordem();
		ordem.setId(dbo.get("_id").toString());
		ordem.setPessoa(new PessoaConverter().converterToPessoa((HashMap<String, Object>) dbo.get("pessoa")));
		ordem.setCidade(new CidadeConverter().converterToCidade((HashMap<String, Object>) dbo.get("cidade")));
		ordem.setServico((String) dbo.get("servico"));
		ordem.setObservacoes((String) dbo.get("observacoes"));
		

		return ordem;
	}

}
