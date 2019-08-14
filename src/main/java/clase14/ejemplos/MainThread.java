package clase14.ejemplos;

public class MainThread {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		Thread hilo1 = new HiloEjemplo(1, 1, c);
		Thread hilo2 = new HiloEjemplo(2, 2, c);
		hilo1.start();
		hilo2.start();

	}

}
