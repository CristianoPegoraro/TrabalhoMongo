package br.edu.unoesc.converter;

import com.mongodb.DBObject;

import br.edu.unoesc.entity.Ordem;

import java.util.HashMap;
import java.util.Map;

public class OrdemConverter {
	

    public Map<String, Object> converterToMap(Ordem ordem) {
        Map<String, Object> mapOrdem = new HashMap<String, Object>();
        mapOrdem.put("servico", ordem.getServico());
        mapOrdem.put("observacoes", ordem.getObservacoes());
        mapOrdem.put("pessoa",
                new PessoaConverter().converterToMap(ordem.getPessoa())
        );

        return mapOrdem;
    }

    public Ordem converterToOrdem(DBObject dbo) {
        Ordem ordem = new Ordem();
        /*ordem.setId(dbo.get("_id").toString());*/
        ordem.setServico((String) dbo.get("servico"));
        ordem.setObservacoes((String) dbo.get("observacoes"));
        ordem.setPessoa(new PessoaConverter().converterToPessoa(
                (HashMap<String, Object>) dbo.get("pessoa"))
        );

        return ordem;
    }

}
