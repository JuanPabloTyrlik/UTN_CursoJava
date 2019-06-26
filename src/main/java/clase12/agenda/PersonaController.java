package clase12.agenda;

import java.util.ArrayList;
import java.util.List;

public class PersonaController {

	private List<Persona> personas = new ArrayList();
	
	public List<Persona>  getAll () 
	{
		return personas;
	}
	
	public Persona add (Persona p) throws PersonaException
	{
		if (personas.contains(p))
			throw new PersonaException("Ya tengo una pesona con el mismo dni");
		personas.add(p);
		return p;
	}
	
	public boolean delete (Persona p) throws PersonaException
	{
		if (!personas.contains(p))
			throw new PersonaException("No existe la persona");
		personas.remove(p);
		return true;
	}
	
	public Persona search (String nombre) throws PersonaException
	{
		for (Persona persona : personas) {
			if(persona.getNombre().equals(nombre))
			{
				return persona;
			}
		}
		throw new PersonaException("No existe la persona");
	}
	
	public boolean testConnection() 
	{
		try {
			boolean b = !(new PersonaDB()).getConnection().isClosed();
			(new PersonaDB()).getConnection().close();
			return b;
		}catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
}
