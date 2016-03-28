package br.edu.unoesc.dao;

import com.mongodb.DBObject;

import br.edu.unoesc.converter.PessoaConverter;
import br.edu.unoesc.entity.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PessoaDao  extends EntityDao<Pessoa> {

    public PessoaDao() {
        super(Pessoa.class);
    }

    public void save(Pessoa pessoa) {
        Map<String, Object> mapPessoa =
                new PessoaConverter().converterToMap(pessoa);

        save(mapPessoa);
    }

    public void update(Pessoa oldPessoa, Pessoa newPessoa) {
        Map<String, Object> query =
                new PessoaConverter().converterToMap(oldPessoa);

        Map<String, Object> map =
                new PessoaConverter().converterToMap(newPessoa);

        update(query, map);
    }

    public void delete(Pessoa pessoa) {
        Map<String, Object> map =
                new PessoaConverter().converterToMap(pessoa);

        delete(map);
    }

    public Pessoa findPessoa(Map<String, Object> mapKeyValue) {
        DBObject dbObject = findOne(mapKeyValue);

        Pessoa pessoa =
                new PessoaConverter().converterToPessoa(dbObject);

        return pessoa;
    }

    public List<Pessoa> findPessoas() {
        List<DBObject> dbObject = findAll();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        for (DBObject dbo : dbObject) {
            Pessoa pessoa = new PessoaConverter().converterToPessoa(dbo);

            pessoas.add(pessoa);
        }

        return pessoas;
    }

    public List<Pessoa> findPessoas(Map<String, Object> mapKeyValue) {
        List<DBObject> dbObject = findKeyValue(mapKeyValue);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        for (DBObject dbo : dbObject) {
            Pessoa pessoa = new PessoaConverter().converterToPessoa(dbo);

            pessoas.add(pessoa);
        }

        return pessoas;
    }
}
