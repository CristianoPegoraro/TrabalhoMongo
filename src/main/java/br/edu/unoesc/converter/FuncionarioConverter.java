package br.edu.unoesc.converter;



import br.edu.unoesc.entity.Funcionario;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioConverter {
	
	
	
	public Map<String, Object> converterToMap(Funcionario funcionario) {
        Map<String, Object> mapFuncionario = new HashMap<String, Object>();
        mapFuncionario.put("nomeFuncionario", funcionario.getNomeFuncionario());
		mapFuncionario.put("setor", funcionario.getSetor());
		mapFuncionario.put("cargo", funcionario.getCargo());
		
        return mapFuncionario;
    }

	


	public Funcionario converterToFuncionario(HashMap<String, Object> hashMap) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario((String) hashMap.get("nomeFuncionario"));
        funcionario.setSetor((String) hashMap.get("setor"));
        funcionario.setCargo((String) hashMap.get("cargo"));
        
        return funcionario;
    }

}
