package clase14.ejemplos;

public class Calculadora {
    int a, b, c;

    synchronized public int sumar(int i, int j) {
        a = i;
        b = j;
        c = a + b;
        System.out.println(c);
        return c;

    }

}
