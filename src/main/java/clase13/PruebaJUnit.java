package clase13;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class PruebaJUnit {
	
	 final static Logger logger = Logger.getLogger(PruebaJUnit.class);

	Agenda agenda;
	
	@Before
	public void antes() throws Exception
	{
		agenda = new Agenda();
		logger.info("hola");
		logger.error("hola222");
		try{
			
			throw new Exception("test");
			
		}catch(Exception e)
		{
			logger.error("fallo", e);
		}
		
		
	}
	
	@Test
	public void add()throws Exception
	{
		
		Persona p = new Persona("facundo", "123");
		agenda.add(p);
		
		assertTrue(true); 
		
		agenda.delete(p);
	}

	@Test
	public void consulta() throws Exception
	{
		List<Persona> list = agenda.get("A");
		assertTrue(list.size()==1);
		List<Persona> list1 = agenda.get("a");
		assertTrue(list1.size()==1);
		List<Persona> list2 = agenda.get("b");
		assertTrue(list2.size()==2);
		List<Persona> list3 = agenda.get("c");
		assertTrue(list3.size()==0);
	}
	
	
	@Test
	public void delete() throws Exception
	{
		
		System.out.println("hola");
		
		Persona p = new Persona("JJJ", "123");
		List<Persona> list = agenda.get("J");
		assertTrue(list.size()==0);
		assertTrue(!list.contains(p));
		agenda.add(p);
		list = agenda.get("J");
		assertTrue(list.size()==1);
		assertTrue(list.contains(p));
		agenda.delete(p);
		list = agenda.get("J");
		assertTrue(list.size()==0);
		assertTrue(!list.contains(p));
		
		
	}
	
}
