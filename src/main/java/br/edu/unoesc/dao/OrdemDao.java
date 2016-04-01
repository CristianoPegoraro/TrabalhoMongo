package br.edu.unoesc.dao;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.DBObject;

import br.edu.unoesc.converter.OrdemConverter;
import br.edu.unoesc.dao.EntityDao;
import br.edu.unoesc.entity.Ordem;

public class OrdemDao  extends EntityDao<Ordem> {

    public OrdemDao() {
        super(Ordem.class);
    }

    public void save(Ordem ordem) {
        Map<String, Object> mapOrdem =
                new OrdemConverter().converterToMap(ordem);

        save(mapOrdem);
    }

    public void update(Ordem oldOrdem, Ordem newOrdem) {
        Map<String, Object> query =
                new OrdemConverter().converterToMap(oldOrdem);

        Map<String, Object> map =
                new OrdemConverter().converterToMap(newOrdem);

        update(query, map);
    }

    public void delete(Ordem ordem) {
        Map<String, Object> map =
                new OrdemConverter().converterToMap(ordem);

        delete(map);
    }

    public Ordem findOrdem(Map<String, Object> mapKeyValue) {
        DBObject dbObject = findOne(mapKeyValue);

        Ordem ordem =
                new OrdemConverter().converterToOrdem(dbObject);

        return ordem;
    }

    public List<Ordem> findOrdems() {
        List<DBObject> dbObject = findAll();

        List<Ordem> ordems = new ArrayList<Ordem>();

        for (DBObject dbo : dbObject) {
            Ordem ordem = new OrdemConverter().converterToOrdem(dbo);

            ordems.add(ordem);
        }

        return ordems;
    }

    public List<Ordem> findOrdems(Map<String, Object> mapKeyValue) {
        List<DBObject> dbObject = findKeyValue(mapKeyValue);

        List<Ordem> ordems = new ArrayList<Ordem>();

        for (DBObject dbo : dbObject) {
            Ordem ordem = new OrdemConverter().converterToOrdem(dbo);

            ordems.add(ordem);
        }

        return ordems;
    }
}
