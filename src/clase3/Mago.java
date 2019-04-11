package clase3;

public class Mago extends Personaje{

	public Mago() {
		super("Mago",5,7,7,70,"Magia +1");
		ataque = fuerza*skill*2/10;
	}
	
	public String atacar() {
		return "Clase: "+clase+"\n\t"+
					"Ataque: "+(int)ataque+"\n\t"+
					"Defensa: "+defensa+"\n\t"+
					"Vida: "+vida;
	}
}
