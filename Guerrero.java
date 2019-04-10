package clase3;

public class Guerrero extends Personaje {

	public Guerrero() {
		super("Guerrero", 10, 10, 5, 100, "Ninguno");
		ataque = fuerza*skill*1/10;
	}

	@Override
	public String atacar() {
		return "Clase: "+clase+"\n\t"+
					"Ataque: "+ataque+"\n\t"+
					"Defensa: "+defensa+"\n\t"+
					"Vida: "+vida;
	}
	
	
	
}
