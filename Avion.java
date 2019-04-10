package clase3;

public class Avion extends Estructura{
	
	public Avion() {
		super();
		concreto=true;
	}
	
	public boolean atravezar(Estructura e) {
		return !(this.concreto && e.concreto);
	}
}
	


