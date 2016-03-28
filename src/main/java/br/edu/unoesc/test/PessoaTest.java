package br.edu.unoesc.test;

import java.util.*;




import br.edu.unoesc.dao.PessoaDao;

import br.edu.unoesc.entity.Pessoa;




public class PessoaTest {

	public static void main(String[] args) 
	{
		//save();
	   update();
	    // delete();

	}

	    private static void save() 
	    {
	        
	    	Pessoa p1 = new Pessoa( "Rodrigo", "4568795-95","33536548");
	        new PessoaDao().save(p1);
	
	        Pessoa p2 = new Pessoa( "Manoel", "65486434-95","33599654");
	        new PessoaDao().save(p2);
	
	        
	        Pessoa p3 = new Pessoa( "Anita", "165489-85","33856548");
	        new PessoaDao().save(p3);
	
	        List<Pessoa> pessoas = new PessoaDao().findPessoas();
	        for (Pessoa pessoa : pessoas) {
	            System.out.println(pessoa.toString());
	        }
	    }



	    private static void update() 
	    {
	        Map<String, Object> map = new HashMap<String, Object>();
	        map.put("Nome", "Anita");
	        Pessoa query = new PessoaDao().findPessoa(map);

	        
	        Pessoa pessoa = new Pessoa("Anita Teste", "35412", "564897");
	        new PessoaDao().update(query, pessoa);

	        Pessoa newPessoa = new PessoaDao().findPessoa(map);
	        System.out.printf("Old:> " + query + "\nNew:> " + newPessoa.toString());
	    }


    private static void delete() 
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("firstName", "Anita");
        List<Pessoa> query = new PessoaDao().findPessoas(map);
        
        
        for (Pessoa pessoa : query) {
            new PessoaDao().delete(pessoa);
        }

        List<Pessoa> pessoas = new PessoaDao().findPessoas();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    } 
	
}
