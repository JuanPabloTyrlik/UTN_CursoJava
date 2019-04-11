package clase3;

public class Enano extends Personaje {
	
	public Enano() {
		super("Enano",12,6,3,100,"Ninguno");
		ataque = fuerza*skill*1.5/10;
	}
	
	public String atacar() {
		return "Clase: "+clase+"\n\t"+
					"Ataque: "+(int)ataque+"\n\t"+
					"Defensa: "+defensa+"\n\t"+
					"Vida: "+vida;
	}
}
