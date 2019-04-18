package clase4.DobleDispatching.PiedraPapelTijera;

public class Test {

    public static void main(String[] args) {
        Juego piedra = new Piedra();
        Juego papel = new Papel();
        Juego tijera = new Tijera();

        System.out.println(piedra.vs(piedra));
        System.out.println(piedra.vs(papel));
        System.out.println(piedra.vs(tijera));
        System.out.println();
        System.out.println(papel.vs(piedra));
        System.out.println(papel.vs(papel));
        System.out.println(papel.vs(tijera));
        System.out.println();
        System.out.println(tijera.vs(piedra));
        System.out.println(tijera.vs(papel));
        System.out.println(tijera.vs(tijera));
        System.out.println();
    }
}
