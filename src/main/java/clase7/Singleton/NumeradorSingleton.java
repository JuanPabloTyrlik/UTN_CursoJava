package clase7.Singleton;

public class NumeradorSingleton {
    private static NumeradorSingleton numerador;
    private static int numero;

    private NumeradorSingleton() {
        super();
    }

    public static NumeradorSingleton getInstance() {
        if (numerador == null) {
            numerador = new NumeradorSingleton();
        }
        return numerador;
    }

    public int getNumero() {
        numero++;
        return numero;
    }


}
