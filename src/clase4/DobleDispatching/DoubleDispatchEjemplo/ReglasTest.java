package clase4.DobleDispatching.DoubleDispatchEjemplo;


class ReglasTest {

	public static void main (String[] arg)
	{

		Peleable piedra = new Piedra();
	    Peleable papel = new Papel();
	    Peleable tijera = new Tijera();
		System.out.println(piedra.vs(tijera));
		System.out.println(papel.vs(tijera));
		System.out.println(tijera.vs(tijera));
	}
    
}
