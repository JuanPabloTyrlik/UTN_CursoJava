package clase3;

public class Elfo extends Personaje{
	
	public Elfo() {
		super("Elfo",8,8,7,80,"Punteria +1");
		ataque = fuerza*skill*1.1/10;
	}
	
	public String atacar() {
		return "Clase: "+clase+"\n\t"+
					"Ataque: "+(int)ataque+"\n\t"+
					"Defensa: "+defensa+"\n\t"+
					"Vida: "+vida;
	}
	
}
