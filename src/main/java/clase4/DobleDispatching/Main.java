package clase4.DobleDispatching;

//Crear un piedra, papel o tijera usando Doble Dispatching sin usar if o switch
//REFACTORIZADOR DE CODIGO -> SONARQUBE, JENKINS

class Main {
    public static void main(String[] args) {
        Piedra piedra = new Piedra();
        Papel papel = new Papel();
        Tijera tijera = new Tijera();

        System.out.printf("%s vs %s: %s\n", piedra.getType(), piedra.getType(), piedra.vs(piedra));
        System.out.printf("%s vs %s: %s\n", piedra.getType(), papel.getType(), piedra.vs(papel));
        System.out.printf("%s vs %s: %s\n", piedra.getType(), tijera.getType(), piedra.vs(tijera));
        System.out.println();
        System.out.printf("%s vs %s: %s\n", papel.getType(), piedra.getType(), papel.vs(piedra));
        System.out.printf("%s vs %s: %s\n", papel.getType(), papel.getType(), papel.vs(papel));
        System.out.printf("%s vs %s: %s\n", papel.getType(), tijera.getType(), papel.vs(tijera));
        System.out.println();
        System.out.printf("%s vs %s: %s\n", tijera.getType(), piedra.getType(), tijera.vs(piedra));
        System.out.printf("%s vs %s: %s\n", tijera.getType(), papel.getType(), tijera.vs(papel));
        System.out.printf("%s vs %s: %s\n", tijera.getType(), tijera.getType(), tijera.vs(tijera));

    }
}
