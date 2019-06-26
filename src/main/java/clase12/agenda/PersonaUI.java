package clase12.agenda;

import java.util.Scanner;

public class PersonaUI {
	private PersonaController pc = new PersonaController();
	private void alta() 
	{
		Persona p = new Persona();
		System.out.println("Ingreso nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("Ingreso apellido");
		String apellido = sc.nextLine();
		System.out.println("Ingrese dni");
		String dni = sc.nextLine();
	    p.setNombre(nombre);
	    p.setApellido(apellido);
	    p.setDni(dni);
	    try {
	    	pc.add(p);
	    }catch (PersonaException pe)
	    {
	    	System.out.println("No pudo crear la persona "+pe.getMessage());
	    }
		iniciar();
		
	}
	
	public void consultar()
	{
		System.out.println("Ingreso nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		try {
			Persona p =pc.search(nombre);
			if (p!=null)
			{
				System.out.println(p.toString());
			}
			else
			{
				System.out.println("no encontro el usario");
			}
		}catch (PersonaException p)
	    {
	    	System.out.println("No encontrar la persona "+p.getMessage());
	    }	
		iniciar();
	}
	public void verTodo()
	{
		System.out.println("------------------------------");
		for (Persona p: pc.getAll()) {
			System.out.println(p);	
		}
		System.out.println("------------------------------");
		iniciar();
	}
	public void testDB()
	{
		System.out.println("Test DB "+pc.testConnection());
		iniciar();
	}
	public void baja()
	{
		
		System.out.println("Ingreso nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		try {
			Persona p =pc.search(nombre);
			if (p!=null)
			{
				System.out.println(p.toString());
			}
			else
			{
				pc.delete(p);
			}
		}catch (PersonaException pe)
	    {
	    	System.out.println("No encontrar la persona "+pe.getMessage());
	    }	
		iniciar();
	}
	
	public void iniciar()
	{
		System.out.println("Bienvenido a la agenda");
		System.out.println("Ingrese la opcion deseada");
		System.out.println("1 Alta");
		System.out.println("2 Baja");
		System.out.println("3 Consulta");
		System.out.println("4 Ver toda la agenda");
		System.out.println("5 Test Conection");
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();	
	    if ("1".equals(input))
	    	alta();
	    if ("2".equals(input))
	    	baja();
	    if ("3".equals(input))
	    	consultar();
	    if ("4".equals(input))
	    	verTodo();
	    if ("5".equals(input))
	    	testDB();
	    
	}
	
	public static void main (String args[])
	{
		PersonaUI iu = new PersonaUI();
		iu.iniciar();
	}

}
