package clase14.ejemplos;

public class HiloEjemplo extends Thread {

    private int numero1;
    private int numero2;
    private Calculadora c;


    public HiloEjemplo(int numero1, int numero2, Calculadora c) {
        super();
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.c = c;
    }


    public void run() {
        c.sumar(numero1, numero2);
    }


}
